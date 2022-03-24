package service;

import com.example.Filter;
import com.example.House;
import io.grpc.Context;

import java.sql.Time;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.TimeUnit;
import java.util.logging.Logger;

public class InMemoryHouseStore implements HouseStore{
    //use a concurrent map in order to store the Houses ID
    private ConcurrentMap<String, House> data;
    private static final Logger logger = Logger.getLogger(InMemoryHouseStore.class.getName());

    public InMemoryHouseStore(){
        data = new ConcurrentHashMap<>(0);
    }

    @Override
    public void Save(House house) throws Exception {
        //Check if the House ID is already in the store of not
        if (data.containsKey(house.getId())){
            // if it is we throw an "Already Exists Exception" and define it in a seperate file
            throw new AlreadyExistsException("House ID already Exists");
        }
        //Create a deep copy of the House
        House other = house.toBuilder().build();
        data.put(other.getId(), other);


    }

    @Override
    public House Find(String id) {
        //If the map doesnt contain the house ID then return as null
        if (!data.containsKey(id)){
            return null;
        }
        House other = data.get(id).toBuilder().build();
        return other;

        //Otherwise deep copy the object from the map

    }

    @Override
    public void Search(Context ctx, Filter filter, HouseStream stream)  {
        //Use a loop to iterate through all elements of the data in the map
        for (Map.Entry<String, House> entry: data.entrySet()){
            if (ctx.isCancelled()){
                logger.info("Context has been cancelled");
                return;
            }
            try {
                TimeUnit.SECONDS.sleep(1);
            }catch (InterruptedException e){
                e.printStackTrace();
            }

            House house = entry.getValue();
            if (isQualified(filter, house)){
                stream.Send(house.toBuilder().build());
            }
        }
    }

    private boolean isQualified(Filter filter, House house) {
        if (house.getEnergyUsed() > filter.getMaxEnergyUsed()){
            return false;
        }
        return true;
    }
}
