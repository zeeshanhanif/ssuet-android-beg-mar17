package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        MyMath mm = new MyMath();
        long x = 300;
        long y = 400;
        long min = mm.min(x,y);
        System.out.println(min);

        double xd = 300.5;
        double yd = 400.6;
        double mind = mm.min(xd,yd);
        System.out.println(mind);
    }
}
