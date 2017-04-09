package com.company;

import java.util.Random;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Random r = new Random();
        int randomNumber = r.nextInt(100);
        System.out.println("Random number "+randomNumber);
    }
}
