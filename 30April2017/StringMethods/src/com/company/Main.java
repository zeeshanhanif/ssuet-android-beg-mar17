package com.company;

public class Main {

    public static void main(String[] args) {
	    String hello = "Hello World";
        System.out.println("startsWith : "+hello.startsWith("Hello"));
        System.out.println("endsWith : "+hello.endsWith("Hello"));
        System.out.println("endsWith : "+hello.endsWith("World"));
        System.out.println("equals : "+hello.equals("hello world"));
        System.out.println("equalsIgnoreCase : "+hello.equalsIgnoreCase("hello world"));
        System.out.println("charAt 0 : "+hello.charAt(0));
        System.out.println("charAt 1 : "+hello.charAt(1));
        System.out.println("length : "+hello.length());
        System.out.println("replace : "+hello.replace("World","Class"));
        System.out.println("replace : "+hello.substring(1,5));
    }
}
