package com.company;

public class Main {

    public static void main(String[] args) {
        MyMath mm = new MyMath();
        mm.max(2,3);
        int myMin = mm.min(2,4);
        System.out.println(myMin);
    }
}
