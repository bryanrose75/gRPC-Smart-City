package service;

import com.example.*;
import com.google.protobuf.ByteString;
import io.grpc.Context;
import io.grpc.Status;
import io.grpc.stub.StreamObserver;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.UUID;
import java.util.logging.Logger;

public class HouseService extends HouseServiceGrpc.HouseServiceImplBase {
    private static final Logger logger = Logger.getLogger(HouseService.class.getName());

    private HouseStore houseStore;

    //Client side streaming

    private ImageStore imageStore;


    //initiallize the HouseStore from constructor
    public HouseService(HouseStore houseStore,ImageStore imageStore){
        this.houseStore = houseStore;
        this.imageStore = imageStore;
    }

    public HouseService(ImageStore imageStore) {
        super();
    }

    @Override
    public void createHouse(CreateHouseRequest request, StreamObserver<CreateHouseResponse> responseObserver) {
        //super.createHouse(request, responseObserver);
        //First we must get the create house object from the request
        House house = request.getHouse();

        String id = house.getId();
        logger.info("Got a create-house request with ID: " + id);

        //Check if the House Id is empty and then create a random UUID for the house
        UUID uuid;
        if (id.isEmpty()){
            uuid = UUID.randomUUID();
        }
        //Check if the provided UUID is a valid ID or not, If it is not then an Illegal argument exception will be thrown
        else{
            //Use try and catch to check exception
            try{
                uuid = UUID.fromString(id);
            }
            catch (IllegalArgumentException e){
                responseObserver.onError(
                        Status.INVALID_ARGUMENT
                            .withDescription(e.getMessage())
                            .asRuntimeException() //Get exception and convert it to a runtime exception and return it
                );
                return;
            }
        }
        //Heavy Processing
//        try {
//            TimeUnit.SECONDS.sleep(6);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }

        if (Context.current().isCancelled()) {
            logger.info("Request has been cancelled");
            responseObserver.onError(
                    Status.CANCELLED
                    .withDescription("request is canelled")
                    .asRuntimeException()
            );
            return;
        }


        // IF all goes well we shall have a valid House ID
        // Convert the house into a builder so that we can use a set of functions to set the ID
        House other = house.toBuilder().setId(uuid.toString()).build();

        //Save other House to an in memory storage
        try {
            houseStore.Save(other);
        }
        catch(AlreadyExistsException e){
            responseObserver.onError(
                    Status.ALREADY_EXISTS
                        .withDescription(e.getMessage())
                        .asRuntimeException()
            );
            return;
        } catch (Exception e){
            responseObserver.onError(
                    Status.INTERNAL //internal server error
                            .withDescription(e.getMessage())
                            .asRuntimeException()
            );
            return;
        }
        CreateHouseResponse response = CreateHouseResponse.newBuilder().setId(other.getId()).build();
        responseObserver.onNext(response); //Return to the client
        responseObserver.onCompleted(); // Use to tell the client that the RPC has completed

        logger.info("saved House with ID: " + other.getId());
    }
    //Server Side streaming
    @Override
    public void searchHouse(SearchHouseRequest request, StreamObserver<SearchHouseResponse> responseObserver) {
        Filter filter = request.getFilter();
        logger.info("Got a search House request with the filter:\n" + filter);

        houseStore.Search(Context.current(), filter, new HouseStream() {
            @Override
            public void Send(House house) {
                logger.info("Found a House with ID: " + house.getId());
                SearchHouseResponse response = SearchHouseResponse.newBuilder().setHouse(house).build();
                responseObserver.onNext(response);
            }
        });

        responseObserver.onCompleted();
        logger.info("Search house completed");
    }




    //Client Side Streaming
    @Override
    public StreamObserver<UploadImageRequest> uploadImage(StreamObserver<UploadImageResponse> responseObserver) {
        return new StreamObserver<UploadImageRequest>() {
            private static final int maxImageSize = 1 << 20; // 1 megabyte
            private String houseID;
            private String imageType;
            private ByteArrayOutputStream imageData;

            @Override
            public void onNext(UploadImageRequest request) {
                if (request.getDataCase() == UploadImageRequest.DataCase.INFO) {
                    ImageInfo info = request.getInfo();
                    logger.info("receive image info:\n" + info);

                    houseID = info.getHouseId();
                    imageType = info.getImageType();
                    imageData = new ByteArrayOutputStream();

                    // Check House exists
                    House found = houseStore.Find(houseID);
                    if (found == null) {
                        responseObserver.onError(
                                Status.NOT_FOUND
                                        .withDescription("House ID doesn't exist")
                                        .asRuntimeException()
                        );
                    }

                    return;
                }

                ByteString chunkData = request.getChunkData();
                logger.info("receive image chunk with size: " + chunkData.size());

                if (imageData == null) {
                    logger.info("image info wasn't sent before");
                    responseObserver.onError(
                            Status.INVALID_ARGUMENT
                                    .withDescription("image info wasn't sent before")
                                    .asRuntimeException()
                    );
                    return;
                }

                int size = imageData.size() + chunkData.size();
                if (size > maxImageSize) {
                    logger.info("image is too large: " + size);
                    responseObserver.onError(
                            Status.INVALID_ARGUMENT
                                    .withDescription("image is too large: " + size)
                                    .asRuntimeException()
                    );
                    return;
                }

                try {
                    chunkData.writeTo(imageData);
                } catch (IOException e) {
                    responseObserver.onError(
                            Status.INTERNAL
                                    .withDescription("cannot write chunk data: " + e.getMessage())
                                    .asRuntimeException()
                    );
                    return;
                }
            }

            @Override
            public void onError(Throwable t) {
                logger.warning(t.getMessage());
            }

            @Override
            public void onCompleted() {
                //Save the output image ID to a variable
                String imageID = "";
                //Get the size of the image
                int imageSize = imageData.size();

                try {
                    imageID = imageStore.Save(houseID, imageType, imageData);
                } catch (IOException e) {
                    responseObserver.onError(
                            Status.INTERNAL
                                    .withDescription("cannot save image to the store: " + e.getMessage())
                                    .asRuntimeException()
                    );
                    return;
                }
                //build a new upload image response object with ID and Size
                UploadImageResponse response = UploadImageResponse.newBuilder()
                        .setId(imageID)
                        .setSize(imageSize)
                        .build();
                //Send reponse to the client
                responseObserver.onNext(response);
                responseObserver.onCompleted();
            }
        };
    }
}
