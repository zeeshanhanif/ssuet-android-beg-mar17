package com.company;

/**
 * Created by Ishaq Hassan on 5/21/2017.
 */
public class Human{
    String name;
    int age;

    public Human(){
        System.out.println("Human Default Constructor");
    }

    public Human(String name,int age){
        this.name = name;
        this.age = age;
        System.out.println("Human 2 args Constructor");
    }
}
