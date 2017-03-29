package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int a = 6; //
        int b = 7; //
        int c = a++ + ++b - b++;//
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println("====");

        int d = 6; //7
        int e = 7; //6
        int f = --e + d++ - --e;//8 //7 //6
        System.out.println(d);
        System.out.println(e);
        System.out.println(f);
    }
}
