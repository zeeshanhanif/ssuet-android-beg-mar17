package com.company;
import java.util.Scanner;
import java.util.Random;
public class Main {

    public static void main(String[] args) {
	// write your code here
        Random r=new Random();
        Scanner s=new Scanner(System.in);
        do {
            int num=r.nextInt(10);
            System.out.println("Random Number "+num);

            for (int i = 0; i <= 2; i++) {
                System.out.println("Enter your Number");
                int guess = s.nextInt();
                if (num == guess) {
                    System.out.println("Win");
                    break;
                } else {
                    if(i == 2){
                        System.out.println("All Tries ended");
                    }else {
                        System.out.println("Please Try Again");
                    }
                }
            }
            System.out.println("Do you want to play again");
            System.out.println("Please Enter 1 to continue or any other number to exit");

            int a = s.nextInt();
            if (a != 1) {
                System.out.println("Bye");
                break;
            }
        }while(true);
    }
}
