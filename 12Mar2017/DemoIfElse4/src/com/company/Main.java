package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println("Before If");
        int score = 50;
        if(score>=60 && score<70){
            System.out.println("C");
        }
        else if(score>=70 && score<80){
            System.out.println("B");
        }
        else if(score >= 80 && score<90){
            System.out.println("A");
        }
        else if(score >= 90 && score<=100){
            System.out.println("A+");
        }
        else {
            System.out.println("Failed");
        }

        System.out.println("After If");

    }
}
