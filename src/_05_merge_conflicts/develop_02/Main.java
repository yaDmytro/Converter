package _05_merge_conflicts.develop_02;

public class Main {


    public static double mileConverterToKilometers(double sizeInMiles){

        return sizeInMiles * 1.609344;
    }

    public static double ftConverterToMeters(double sizeInFt){

        return sizeInFt * 0.3048;
    }

    public static void main(String[] args){

        double tenMiles = 10;
        double tenMilesInKilometers = mileConverterToKilometers(tenMiles);
        System.out.printf("%f miles in kilometers will be %f.", tenMiles, tenMilesInKilometers);

        System.out.println();

        double tenFts = 10;
        double tenFtsInMeters = ftConverterToMeters(tenFts);
        System.out.printf("%f fts in meters will be %f.", tenFts, tenFtsInMeters);

    }
}

