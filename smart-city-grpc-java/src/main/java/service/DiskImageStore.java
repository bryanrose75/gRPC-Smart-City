package service;

import java.io.ByteArrayOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.UUID;
import java.util.concurrent.ConcurrentMap;

public class DiskImageStore implements ImageStore {
    private String imageFolder;
    private ConcurrentMap<String, ImageMetaData> data; //Store the meta data of the images

    public DiskImageStore(String imageFolder){
        //initialize the new data map with a new concurrent
    }

    @Override
    public String Save(String houseID, String imageType, ByteArrayOutputStream imageData) throws IOException {
        String imageID = UUID.randomUUID().toString();
        String imagePath = String.format("%s/%s%s", imageFolder, imageID, imageType);

        FileOutputStream fileOutputStream = new FileOutputStream(imagePath);
        imageData.writeTo(fileOutputStream);
        fileOutputStream.close();
        //Create a new meta data object when the file has been written to the disk
        ImageMetaData metadata = new ImageMetaData(houseID, imageType, imagePath);
        // Put it to the data map
        data.put(imageID, metadata);

        return imageID;

    }
}
