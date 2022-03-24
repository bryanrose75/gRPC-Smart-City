package service;

public class ImageMetaData {
    private String houseID;
    private String type;
    private String path;

    //constructor to initialize the object
    public ImageMetaData(String houseID, String type, String path){
        this.houseID = houseID;
        this.type = type;
        this.path = path;
    }

    public String getHouseID() {
        return houseID;
    }

    public String getType() {
        return type;
    }

    public String getPath() {
        return path;
    }
}
