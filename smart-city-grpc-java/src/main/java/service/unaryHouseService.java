package service;

import com.example.*;
import io.grpc.Context;
import io.grpc.Status;
import io.grpc.stub.StreamObserver;

import java.util.UUID;
import java.util.logging.Logger;

public class unaryHouseService extends HouseServiceGrpc.HouseServiceImplBase {
    private static final Logger logger = Logger.getLogger(unaryHouseService.class.getName());

    private HouseStore store;

    //initiallize the HouseStore from constructor
    public unaryHouseService(HouseStore store){
        this.store = store;
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
            store.Save(other);
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

    @Override
    public void searchHouse(SearchHouseRequest request, StreamObserver<SearchHouseResponse> responseObserver) {
        Filter filter = request.getFilter();
        logger.info("Got a search House request with the filter:\n" + filter);

        store.Search(filter, new HouseStream() {
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
}
