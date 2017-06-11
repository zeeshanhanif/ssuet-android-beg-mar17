package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Human h = new Human("Abc",30);
        System.out.println(h.getAge());
        System.out.println(h.getName());

        Human h1 = new Human("Abc",30);
        System.out.println(h.equals(h1));

        System.out.println(h);

        String a = "Hello";
        String b = "World";
        if(a.equals(b)){

        }

    }
}
