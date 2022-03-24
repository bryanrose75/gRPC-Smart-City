package service;

import java.io.ByteArrayOutputStream;
import java.io.IOException;

public interface ImageStore {
    String Save(String houseID, String imageType, ByteArrayOutputStream imageData) throws IOException;
}
