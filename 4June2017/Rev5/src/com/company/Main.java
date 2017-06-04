package com.company;

import java.util.Random;

public class Main {

    public static void main(String[] args) {
	    Vehicle[] vehicles = new Vehicle[3];
        vehicles[0] = new Car("2013","Black","Honda");
        vehicles[1] = new Bus("2014","Blue","Suzuki");
        vehicles[2] = new Truck("2015","Green","Benz");
        Random r = new Random();
        int randomNumber = r.nextInt(3);

        /*
        Vehicle v = new Vehicle("2012","White","Toyota");
        Car c = new Car("2013","Black","Honda");
        Bus b = new Bus("2014","Blue","Suzuki");
        Truck t = new Truck("2015","Green","Benz");*/

        WorkShop workShop = new WorkShop();
        workShop.service(vehicles[randomNumber]);
    }
}
