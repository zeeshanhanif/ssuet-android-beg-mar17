package com.company;

public class Main {
    public static void main(String[] args) {
        // write your code here
        for(int i = 0;i<5;i++){
            System.out.println("Before "+i);
            if(i == 3){
                continue;
            }
            System.out.println("After "+i);
        }
    }
}
