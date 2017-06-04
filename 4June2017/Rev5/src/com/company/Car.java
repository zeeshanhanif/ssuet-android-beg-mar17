package com.company;

/**
 * Created by Ishaq Hassan on 6/4/2017.
 */
public class Car extends Vehicle {

    public Car(String model, String color, String brand) {
        super(model, color, brand);
    }

    public void doService(){
        System.out.println("Car Service!");
    }
}
