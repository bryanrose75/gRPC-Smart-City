package service;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.concurrent.ConcurrentMap;

public class DiskImageStore implements ImageStore {
    private String imageFolder;
    private ConcurrentMap<String, ImageMetaData> data; //Store the meta data of the images
    @Override
    public String Save(String houseID, String imageType, ByteArrayOutputStream imageData) throws IOException {
        return null;
    }
}
