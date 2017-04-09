package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int userinput = scan.nextInt();
        boolean isPrime=true;
        for (int i = 2; i < userinput; i++) {
            if (userinput % i == 0) {
                System.out.println("num is prime not at:" + i);
                isPrime=false;
                break;
            } else {

            }
        }
        if (isPrime)
        System.out.println("num is prime ");
    }
}

