package service;

import com.example.CreateHouseRequest;
import com.example.CreateHouseResponse;
import com.example.House;
import com.example.HouseServiceGrpc;
import io.grpc.ManagedChannel;
import io.grpc.StatusRuntimeException;
import io.grpc.inprocess.InProcessChannelBuilder;
import io.grpc.inprocess.InProcessServerBuilder;
import io.grpc.testing.GrpcCleanupRule;
import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import sample.Generator;
import static org.junit.Assert.*;

public class HouseServerTest {
    @Rule //clean up the conection after the test by using the grpc clean up
    public final GrpcCleanupRule grpcCleanup = new GrpcCleanupRule(); //Automatic graceful shutdown at end of the test

    private HouseStore store;
    private HouseServer server;
    private ManagedChannel channel;

    @Before
    public void setUp() throws Exception {

        String serverName = InProcessServerBuilder.generateName();
        InProcessServerBuilder serverBuilder = InProcessServerBuilder.forName(serverName). directExecutor();

        //initialise the store as an in memory house store
        store = new InMemoryHouseStore();
        server = new HouseServer(serverBuilder, 0, store);
        server.start();

        channel = grpcCleanup.register(
                InProcessChannelBuilder.forName(serverName).directExecutor().build()
        );
    }
    @After
    public void tearDown() throws Exception {
        server.stop();
    }

    @Test
    public void createHouseWithValidID(){
        Generator generator = new Generator();
        House house = generator.NewHouse();
        CreateHouseRequest request = CreateHouseRequest.newBuilder().setHouse(house).build();
        //use blocking stub on the channel created in the set up function
        HouseServiceGrpc.HouseServiceBlockingStub stub = HouseServiceGrpc.newBlockingStub(channel);
        CreateHouseResponse response = stub.createHouse(request);
        assertNotNull(response);
        //should be equal to the input house ID
        assertEquals(house.getId(), response.getId());

        //Find ID in the storage
        House found = store.Find(response.getId());
        assertNotNull(found);
    }

    @Test
    public void createHouseWithEmptyID(){
        Generator generator = new Generator();
        House house = generator.NewHouse().toBuilder().setId("").build();
        CreateHouseRequest request = CreateHouseRequest.newBuilder().setHouse(house).build();
        //use blocking stub on the channel created in the set up function
        HouseServiceGrpc.HouseServiceBlockingStub stub = HouseServiceGrpc.newBlockingStub(channel);
        CreateHouseResponse response = stub.createHouse(request);
        assertNotNull(response);

        assertFalse(response.getId().isEmpty());

        //Find ID in the storage
        House found = store.Find(response.getId());
        assertNotNull(found);
    }
    //we must expect there to be runtime expection in this case
    @Test(expected = StatusRuntimeException.class)
    public void createHouseWithInvalidID(){
        Generator generator = new Generator();
        House house = generator.NewHouse().toBuilder().setId("Invalid").build();
        CreateHouseRequest request = CreateHouseRequest.newBuilder().setHouse(house).build();
        //use blocking stub on the channel created in the set up function
        HouseServiceGrpc.HouseServiceBlockingStub stub = HouseServiceGrpc.newBlockingStub(channel);
        CreateHouseResponse response = stub.createHouse(request);
//        assertNull(response);
//        //Must Check that the response ID is Null
//        assertNull(response.getId());
    }
    @Test(expected = StatusRuntimeException.class)
    public void createHouseWithAnAlreadyExistsID() throws Exception{
        Generator generator = new Generator();
        House house = generator.NewHouse();
        store.Save(house);
        CreateHouseRequest request = CreateHouseRequest.newBuilder().setHouse(house).build();
        //use blocking stub on the channel created in the set up function
        HouseServiceGrpc.HouseServiceBlockingStub stub = HouseServiceGrpc.newBlockingStub(channel);
        CreateHouseResponse response = stub.createHouse(request);

    }
}