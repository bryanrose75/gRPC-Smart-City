package service;

import com.example.*;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import io.grpc.Status;
import io.grpc.StatusRuntimeException;
import sample.Generator;

import javax.swing.*;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;

public class HouseClientUnary {
    private static final Logger logger = Logger.getLogger(HouseClientServerStreaming.class.getName());

    //To connect to the server we need to use a manage Channel object
    private final ManagedChannel channel;

    //We also need to add a blocking stub to call the unary RPC
    private final HouseServiceGrpc.HouseServiceBlockingStub blockingStub;


    //Create two arguments, server host and port
    public HouseClientUnary(String host, int port){

        //we use a manage channel builder to build a channel with a specified host and port
        channel = ManagedChannelBuilder.forAddress(host, port)
                .usePlaintext()
                .build();

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
        String houseID = response.getId();
    }

//Unary House client

    public static void main(String[] args) throws InterruptedException {

        //create a new client that connects to port 8080
        HouseClientServerStreaming client = new HouseClientServerStreaming("0.0.0.0", 8080);

        Generator generator = new Generator();
        House house = generator.NewHouse().toBuilder().setId("").build();


        try {
            client.createHouse(house);
            JOptionPane.showMessageDialog(null, "House Created:\n " + house);
        }
        finally {
            client.shutdown();
        }
    }
}
