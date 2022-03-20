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

        double residenceAmount = randomDouble(1, 10);
        double monthlySpendEURO = randomDouble(100, 2000);

        double energy_used = randomDouble(10, 1000);
        double priceUsd = randomDouble(1500, 3500);

        int yearJoinedSmartCity = randomInt(2000, 2022);

        return House.newBuilder()
                .setId(UUID.randomUUID().toString())
                .setDistrict(district)
                .setEnergyUsed(energy_used)
//                .setPriceUsd(priceUsd)
                  .setDublinArea(dublinArea)
//                .setWeightKg(residenceAmount())
//                .setMonthlySpendEURO(monthlySpendEURO())
//                .setMonthlySpendEURO(monthlySpendEURO)
//                .setReleaseYear(yearJoinedSmartCity)
                .setUpdatedAt(timestampNow())

                .build();
    }

    public double NewHouseEnergyUsage() {
        return randomInt(1, 10);
    }

    private Timestamp timestampNow() {
        Instant now = Instant.now();
        return Timestamp.newBuilder()
                .setSeconds(now.getEpochSecond())
                .setNanos(now.getNano())
                .build();
    }

    private String randomHouseArea(String dublinArea) {
        switch (dublinArea) {
            case "1":
                return randomStringFromSet("Macbook Air", "Macbook Pro");
            case "2":
                return randomStringFromSet("Latitude", "Vostro", "XPS", "Alienware");
            case "3":
                return randomStringFromSet("Macbook Air", "Macbook Pro");
            case "4":
                return randomStringFromSet("Latitude", "Vostro", "XPS", "Alienware");
            case "5":
                return randomStringFromSet("Macbook Air", "Macbook Pro");
            case "6":
                return randomStringFromSet("Latitude", "Vostro", "XPS", "Alienware");
            case "7":
                return randomStringFromSet("Macbook Air", "Macbook Pro");
            case "8":
                return randomStringFromSet("Latitude", "Vostro", "XPS", "Alienware");
            case "9":
                return randomStringFromSet("Macbook Air", "Macbook Pro");
            case "10":
                return randomStringFromSet("Latitude", "Vostro", "XPS", "Alienware");
            case "11":
                return randomStringFromSet("Macbook Air", "Macbook Pro");
            case "12":
                return randomStringFromSet("Latitude", "Vostro", "XPS", "Alienware");
            case "13":
                return randomStringFromSet("Macbook Air", "Macbook Pro");
            case "14":
                return randomStringFromSet("Latitude", "Vostro", "XPS", "Alienware");
            case "16":
                return randomStringFromSet("Macbook Air", "Macbook Pro");
            case "17":
                return randomStringFromSet("Latitude", "Vostro", "XPS", "Alienware");
            case "18":
                return randomStringFromSet("Macbook Air", "Macbook Pro");
            case "19":
                return randomStringFromSet("Latitude", "Vostro", "XPS", "Alienware");
            case "20":
                return randomStringFromSet("Macbook Air", "Macbook Pro");
            case "21":
                return randomStringFromSet("Latitude", "Vostro", "XPS", "Alienware");
            case "22":
                return randomStringFromSet("Macbook Air", "Macbook Pro");
            case "23":
                return randomStringFromSet("Latitude", "Vostro", "XPS", "Alienware");
            case "24":
                return randomStringFromSet("Macbook Air", "Macbook Pro");
            default:
                return randomStringFromSet("Thinkpad X1", "Thinkpad P1", "Thinkpad P53");
        }
    }

    private String randomHouseDistrict() {
        return randomStringFromSet("1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11"
                , "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23"
                , "24");
    }


    private float randomFloat(float min, float max) {
        return min + rand.nextFloat() * (max - min);
    }


    private double randomDouble(double min, double max) {
        return min + rand.nextDouble() * (max - min);
    }

    private int randomInt(int min, int max) {
        return min + rand.nextInt(max - min + 1);
    }


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