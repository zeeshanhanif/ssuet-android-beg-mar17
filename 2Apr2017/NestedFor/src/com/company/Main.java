package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        for(int i = 0;i<3;i++){
            System.out.println("Hello "+i);
            for(int j = 0;j<4;j++){
                System.out.println("Nested "+j);
            }
        }
        System.out.println("After Loop");
    }
}
