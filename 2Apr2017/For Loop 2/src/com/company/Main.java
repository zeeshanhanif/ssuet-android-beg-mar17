package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        for(int i = 0;i<5;i++){
            System.out.println("Before "+i);
            if(i == 6){
                break;
            }
            System.out.println("After "+i);
        }
    }
}
