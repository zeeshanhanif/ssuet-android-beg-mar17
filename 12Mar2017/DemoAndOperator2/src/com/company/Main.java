package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        boolean a = true;
        boolean b = false;
        boolean c = a & b;
        boolean d = a && b;
        //System.out.println(c);
        //System.out.println(d);

        int a1 = 6;
        boolean c1 = a1>10 & a1<20;
        boolean d1 = a1>10 && a1<20;
        System.out.println(c1);
        System.out.println(d1);


    }
}
