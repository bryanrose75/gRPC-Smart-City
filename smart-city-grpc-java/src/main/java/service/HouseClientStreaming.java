package service;

import com.example.*;
import com.google.protobuf.ByteString;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import io.grpc.Status;
import io.grpc.StatusRuntimeException;
import io.grpc.stub.StreamObserver;
import sample.Generator;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Iterator;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;

public class HouseClientStreaming {
    private static final Logger logger = Logger.getLogger(HouseClientStreaming.class.getName());

    //To connect to the server use a manage Channel object
    private final ManagedChannel channel;

    //add a blocking stub to call the unary RPC
    private final HouseServiceGrpc.HouseServiceBlockingStub blockingStub;

    //Use service stub for the client streaming
    private final HouseServiceGrpc.HouseServiceStub asyncStub;

    //Create two arguments, server host and port
    public HouseClientStreaming(String host, int port){

        //we use a manage channel builder to build a channel with a specified host and port
        channel = ManagedChannelBuilder.forAddress(host, port)
                .usePlaintext()
                .build();

        //inizitalize the constructors
        asyncStub = HouseServiceGrpc.newStub(channel);
        blockingStub = HouseServiceGrpc.newBlockingStub(channel);

    }
    //Write a shut down function to close the channel

    public void shutdown() throws InterruptedException {
        //wait for at most 5 seconds
        channel.shutdown().awaitTermination(5, TimeUnit.SECONDS);
    }
    // Create a new house function to call the rpc to create a new house on the server
    public void createHouse(House house){
        CreateHouseRequest request = CreateHouseRequest.newBuilder().setHouse(house).build();
        CreateHouseResponse response = CreateHouseResponse.getDefaultInstance();
        try{
            response = blockingStub.withDeadlineAfter(5, TimeUnit.SECONDS).createHouse(request);
        }catch(StatusRuntimeException e){
            if (e.getStatus().getCode() == Status.Code.ALREADY_EXISTS){
                logger.info("House ID already Exists");
                return;
            }
            logger.log(Level.SEVERE, "Request has Failed: " + e.getMessage());
            return;
        }
        catch (Exception e) {
            logger.log(Level.SEVERE, "Request has Failed: " + e.getMessage());
            return;
        }
        //Create an info log to return the House ID
        logger.info("House Created with ID: " + response.getId());


    }
//    //Uploading the image using the Client streaming
public void uploadImage(String houseID, String imagePath) throws InterruptedException {
        logger.info("IMAGE PATH: " + imagePath);
    //Use a count down latch to wait for the whole process to be completed
    final CountDownLatch finishLatch = new CountDownLatch(1);

    StreamObserver<UploadImageRequest> requestObserver = asyncStub.withDeadlineAfter(5, TimeUnit.SECONDS)
            .uploadImage(new StreamObserver<UploadImageResponse>() {

                @Override
                public void onNext(UploadImageResponse response) {
                    logger.info("receive response:\n " + response);
                }

                @Override
                public void onError(Throwable t) {
                    logger.log(Level.SEVERE, "upload failed: " + t);
                    finishLatch.countDown();
                }

                @Override
                public void onCompleted() {
                    logger.info("Image has been uploaded");
                    finishLatch.countDown();
                }
            });

    FileInputStream fileInputStream;
    try {
        fileInputStream = new FileInputStream(imagePath);
    } catch (FileNotFoundException e) {
        logger.log(Level.SEVERE, "Cannot read the image file" + e.getMessage());
        return;
    }
    //get the image type from the image type extention
    String imageType = imagePath.substring(imagePath.lastIndexOf("."));
    ImageInfo info = ImageInfo.newBuilder().setHouseId(houseID).setImageType(imageType).build();
    //create a new upload image request with the image info
    UploadImageRequest request = UploadImageRequest.newBuilder().setInfo(info).build() ;

    try {
        requestObserver.onNext(request);
        logger.info("Sent image info:\n" + info);

        byte[] buffer = new byte[1024];
        //Use while loop to read and send data multiple times
        while (true){
            //Read more data to the buffer
            int n = fileInputStream.read(buffer);
            //If it is = 0 than it is the end of the file and the loop can be broken
            if(n <= 0){
                break;
            }
            //Check if an unexpected error has closed the latch
            if (finishLatch.getCount() == 0){
                return;
            }
            //Make a new request with the chunk data
            request = UploadImageRequest.newBuilder()
                    .setChunkData(ByteString.copyFrom(buffer, 0, n))
                    .build();
            //Send request to the server
            requestObserver.onNext(request);
            logger.info("Sent Image chunk with size: " + n);

        }


    }catch (Exception e){
        logger.log(Level.SEVERE, " unexpected error: " + e.getMessage());
        //Report the error to the server
        requestObserver.onError(e);
        return;
    }

    //Finally Call the request observer
    requestObserver.onCompleted();


    //Set the wait for 1 min which is more than enough as the timer above is set for 5 seconds
    if(!finishLatch.await(1, TimeUnit.MINUTES)){
        logger.warning("request did not finish within 1 minute ");
    }
}


// Server side streaming client
    public static void main(String[] args) throws InterruptedException {
        //create a new client that connects to port 8080
        HouseClientStreaming client = new HouseClientStreaming("0.0.0.0", 8080);

        Generator generator = new Generator();

        try {
            //Test the uplaod image path
            House house = generator.NewHouse();
            client.createHouse(house);
            client.uploadImage(house.getId(), "/Users/bryan/Documents/4thYear/DistributedSystems/DS-Project/gRPC-Smart-City/smart-city-grpc-java/tmp/house.jpg");

        } finally {
            client.shutdown();
        }
    }

}
