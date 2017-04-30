package com.company;

public class Main {

    public static void main(String[] args) {
        upper:
        for(int i = 1;i<5;i++){
            inner:
            for(int j = 1;j<3;j++){
                System.out.println(i+" : "+j);
                if(i==j){
                    continue upper;
                }
            }
            System.out.println("After");
        }
    }
}
