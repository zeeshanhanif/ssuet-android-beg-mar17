package com.company;

public class Main {

    public static void main(String[] args) {
	    String hello = "Hello World";
        String world = new String("Hello World");
        String abc = "Hello World!";
        String xyz = new String("Hello World!");
        boolean check = hello == abc;
        boolean checkTwo = hello == world;
        boolean checkThree = world == xyz;
        boolean checkEqual = world.equals(xyz);
        System.out.println("Check : "+check);
        System.out.println("Check Two : "+checkTwo);
        System.out.println("Check Three : "+checkThree);
        System.out.println("Check Equal : "+checkEqual);
    }
}
