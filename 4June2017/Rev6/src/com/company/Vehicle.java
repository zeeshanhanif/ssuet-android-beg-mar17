package com.company;

/**
 * Created by Ishaq Hassan on 6/4/2017.
 */
public abstract class Vehicle {
    private String model;
    private String color;
    private String brand;

    public Vehicle(String model, String color, String brand) {
        this.model = model;
        this.color = color;
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public abstract void doService();
}
