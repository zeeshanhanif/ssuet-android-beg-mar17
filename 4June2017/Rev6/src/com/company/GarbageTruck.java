package com.company;

/**
 * Created by Ishaq Hassan on 6/4/2017.
 */
public class GarbageTruck extends Truck {
    public GarbageTruck(String model, String color, String brand) {
        super(model, color, brand);
    }

    public void loadingWeight(){
        System.out.println("loadingWeight In Garbage Truck!");
    }
}
