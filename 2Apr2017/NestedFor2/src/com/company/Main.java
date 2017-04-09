package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        for(int i = 0;i<5;i++){
            System.out.println("Hello i "+i);
            for(int j = 0;j<i;j++){
                System.out.println("Nested j "+j);
            }
        }
        System.out.println("After Loop");
    }
}
