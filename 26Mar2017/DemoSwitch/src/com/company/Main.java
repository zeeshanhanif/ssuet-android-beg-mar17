package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int score = 89;
        switch (score){
            case 90:
                System.out.println("A+");
                break;
            case 80:
                System.out.println("B");
                break;
            case 70:
                System.out.println("C");
                break;
            default:
                System.out.println("Failed");
                break;
        }
    }
}
