package service;

import com.example.Filter;
import com.example.House;
import io.grpc.Context;

public interface HouseStore {
    void Save(House house) throws Exception; //Consider using a different db model object to decouple between the data transfer and storage layers
    House Find(String id);

    //Create a search function for server side streaming
    void Search(Context ctx, Filter filter, HouseStream stream);
}

