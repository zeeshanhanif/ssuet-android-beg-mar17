package com.company;

/**
 * Created by Ishaq Hassan on 6/4/2017.
 */
public class Truck extends Vehicle {
    public Truck(String model, String color, String brand) {
        super(model, color, brand);
    }

    public void doService(){
        System.out.println("Truck Service!");
    }

    public final void loadingWeight(){
        System.out.println("loadingWeight In Truck!");
    }
}
