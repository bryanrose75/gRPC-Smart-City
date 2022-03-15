package service;

import com.example.House;

public interface HouseStore {
    void save(House house) throws Exception; //Consider using a different db model object to decouple between the data transfer and storage layers
    House Find(String id);
}
