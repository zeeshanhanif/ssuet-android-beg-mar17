package com.company;

public class Main {

    public static void main(String[] args) {
	    String abc = "Hello world";
        /*System.out.println(abc);*/
        Student alisha = new Student("Alisha",20);
        alisha.study();
        alisha.setAge(25);
        alisha.study();
        String myageIs = alisha.getAge();
        System.out.println(myageIs);
    }
}
