package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int a = 6;
        int b = a++; //b6 a7
        System.out.println("A "+a);
        int c = ++a; //a8 c8
        System.out.println("A "+a);
        System.out.println("B "+b);
        System.out.println("C "+c);
    }
}
