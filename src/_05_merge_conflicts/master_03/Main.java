package _05_merge_conflicts.master_03;
import java.lang.*;

public class Main {


    public static double mileConverterToKilometers(double sizeInMiles){
        return sizeInMiles * 1.609344;
    }

    public static void main(String[] args){

        System.out.println("Convertor for converting sizes from USA metric system into international metric system");

        double tenMiles = 10;
        double tenMilesInKilometers = mileConverterToKilometers(tenMiles);

        System.out.printf("%f miles in kilometers will be %f.", tenMiles, tenMilesInKilometers);
    }
}

