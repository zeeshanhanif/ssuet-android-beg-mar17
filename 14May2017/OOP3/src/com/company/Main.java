package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        MyMath mm = new MyMath();
        long x = 10;
        long y = 20;
        int min = mm.min(10,20);
        long min2 = mm.minLong(x,y);
        double min1 = mm.minDouble(10.5,15.2);
        System.out.println(min);
        System.out.println(min1);
    }
}
