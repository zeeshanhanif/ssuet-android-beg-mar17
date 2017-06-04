package com.company;

/**
 * Created by Ishaq Hassan on 6/4/2017.
 */
public class Bus extends Vehicle {
    public Bus(String model, String color, String brand) {
        super(model, color, brand);
    }

    public void doService(){
        System.out.println("Bus Service!");
    }
}
