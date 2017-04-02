package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int score = 94;
        if(score > 90){
            System.out.println("A+");
            if(score >97){
                System.out.println("Reward Rs. 25000");
            }
            else if(score > 95){
                System.out.println("Reward Rs. 20000");
            }
            else if(score > 93){
                System.out.println("Reward Rs. 15000");
            }

        }
        else if(score > 80){
            System.out.println("A");
        }
        else if(score > 70){
            System.out.println("B");
        }
        else if(score > 60){
            System.out.println("C");
        }
        else {
            System.out.println("Failed");
        }


    }
}
