package com.company;

/**
 * Created by Ishaq Hassan on 5/21/2017.
 */
public class Student {
    String name;
    int age;
    String email;

    public Student(String name,int age,String email){
        this(name);
        System.out.println("Three Args Constructor");
        this.age = age;
    }

    public Student(String name,String email){
        this.name = name;
        this.email = email;
        System.out.println("Two Args Constructor");
    }

    public Student(String name){
        this.name = name;
        System.out.println("One Args Constructor");
    }


    public Student(){
    }
}
