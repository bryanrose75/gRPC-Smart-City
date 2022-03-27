package sample;

import com.example.*;
import com.google.protobuf.Timestamp;

import java.time.Instant;
import java.util.Random;
import java.util.UUID;

public class Generator {
    private Random rand;

    public Generator() {
        rand = new Random();
    }


    public House NewHouse() {
        String district = randomHouseDistrict();
        String dublinArea = randomHouseArea(district);

  //      double residenceAmount = randomDouble(1, 10);
  //      double monthlySpendEURO = randomDouble(100, 2000);

        double energy_used = randomDouble(10, 1000);
  //      double priceUsd = randomDouble(1500, 3500);

  //     int yearJoinedSmartCity = randomInt(2000, 2022);

        return House.newBuilder()
                .setId(UUID.randomUUID().toString())
                .setDistrict(district)
                .setEnergyUsed(energy_used)
                .setDublinArea(dublinArea)
                //.setUpdatedAt(timestampNow())

                .build();
    }

//    public double NewHouseEnergyUsage() {
//        return randomInt(1, 10);
//    }

//    private Timestamp timestampNow() {
//        Instant now = Instant.now();
//        return Timestamp.newBuilder()
//                .setSeconds(now.getEpochSecond())
//                .build();
//    }

    private String randomHouseArea(String dublinArea) {
        switch (dublinArea) {
            case "1":
                return randomStringFromSet("Abbey St.", "Amiens St.", "Capel St.", "Mountjoy Sq.");
            case "2":
                return randomStringFromSet("Dawson St.", "Fitzwilliam Sq.", "Harcourt St.", "Pearse St.");
            case "3":
                return randomStringFromSet("Fairview", "Marino");
            case "4":
                return randomStringFromSet("Sandymount", "Ringsend", "Donnybrook", "Ballsbridge");
            case "5":
                return randomStringFromSet("Raheny", "Hamonstown");
            case "6":
                return randomStringFromSet("Darty", "Rathgar", "Raneleigh", "Sandford");
            case "7":
                return randomStringFromSet("Four Courts", "Cabra");
            case "8":
                return randomStringFromSet("", "Portobello", "Island Bridge", "Inchicore");
            case "9":
                return randomStringFromSet(" Beaumont", "Drumcondra");
            case "10":
                return randomStringFromSet("Ballyfermont");
            case "11":
                return randomStringFromSet("BallyGall", "Dubber");
            case "12":
                return randomStringFromSet("Bluebell", "Crumlin", "Walkinstown");
            case "13":
                return randomStringFromSet("Howth", "Sutton");
            case "14":
                return randomStringFromSet("Dundrum", "Goatstown", "Churchtown", "Roebuck");
            case "16":
                return randomStringFromSet("Ballinteer", "Knoclyon");
            case "17":
                return randomStringFromSet("Belcamp", "Balgriffin", "Priorswood", "Darndale");
            case "18":
                return randomStringFromSet("Cabinteely", "Foxrock");
            case "15":
                return randomStringFromSet("Blanchardstown", "Clonee", "Corduff", "Clonsilla");
            case "20":
                return randomStringFromSet("Chapelizod", "Palmerstown");
            case "22":
                return randomStringFromSet("Bawnogue", "Neilstown");
            case "24":
                return randomStringFromSet("Jobstown", "Tallaght");
            default:
                return randomStringFromSet("No Area");
        }
    }

    private String randomHouseDistrict() {
        return randomStringFromSet("1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11"
                , "12", "13", "14", "15", "16", "17", "18", "19", "20", "22"
                , "24");
    }


//    private float randomFloat(float min, float max) {
//        return min + rand.nextFloat() * (max - min);
//    }


    private double randomDouble(double min, double max) {
        return min + rand.nextDouble() * (max - min);
    }

//    private int randomInt(int min, int max) {
//        return min + rand.nextInt(max - min + 1);
//    }


    private String randomStringFromSet(String... a) {
        int n = a.length;
        if (n == 0) {
            return "";
        }
        return a[rand.nextInt(n)];
    }


    public static void main(String[] args) {
        Generator generator = new Generator();
        House house = generator.NewHouse();
        System.out.println(house);
    }
}