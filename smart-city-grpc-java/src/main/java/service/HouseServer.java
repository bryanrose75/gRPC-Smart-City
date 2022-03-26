package service;

import io.grpc.Server;
import io.grpc.ServerBuilder;

import javax.swing.*;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import java.util.logging.Logger;

public class HouseServer {
    //write some logs
    private static final Logger logger = Logger.getLogger(HouseServer.class.getName());

    private final int port;
    private final Server server;

    //write two constructors 1. a port and 2. a House Store as input
    public HouseServer(int port, HouseStore houseStore, ImageStore imageStore){
        this(ServerBuilder.forPort(port), port, houseStore, imageStore);
    }

    // Take a gRPC server builder as the second input
    // useful for unit testing
    public  HouseServer(ServerBuilder serverBuilder, int port, HouseStore houseStore, ImageStore imageStore){
        this.port = port;
        HouseService houseService = new HouseService(houseStore, imageStore);
      //  HouseService houseService1 = new HouseService(imageStore)
        server = serverBuilder.addService(houseService).build(); //apply to build to start the gRPC server
    }
    //create a function to start the server
    public void start() throws IOException {
        server.start();
        logger.info("server started on port: " + port);
        //Add a hook to the server so that the GRPC can be smoothly shut down
        Runtime.getRuntime().addShutdownHook(new Thread() {

            @Override
            public void run() {
                System.err.println("Shut down gRPC server because JVM has shut down!");
                try {
                    HouseServer.this.stop();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.err.println("Server shut down");
            }
        });
    }
    public void stop() throws InterruptedException {
        if (server != null){
            server.shutdown().awaitTermination(30, TimeUnit.SECONDS);
        }
    }

    //Block threats while the GRPC server shuts down
    private void blockUntilShutdown() throws InterruptedException {
        if (server != null) {
            server.awaitTermination();
        }
    }

    //Create the main function
    public static void main(String[] args) throws InterruptedException, IOException {
        InMemoryHouseStore houseStore = new InMemoryHouseStore();
        DiskImageStore imageStore = new DiskImageStore("img");


        HouseServer server = new HouseServer(8080, houseStore, imageStore); //Initialise the Server on port 8080
        server.start(); // call this function to start the server
        server.blockUntilShutdown();

        JOptionPane.showMessageDialog(null, "Message" );

    }
}
