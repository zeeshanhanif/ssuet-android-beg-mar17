package com.company;

public class Main {

    public static void main(String[] args) {
	    Student abc = new Student();
        abc.name = "Usman";
        abc.age = 35;

        Student xyz = new Student();
        xyz.name = "Arbaz";
        xyz.age = 40;

        System.out.println(abc.name);
        //System.out.println(abc.study());
        abc.study();
    }
}
