package com.company;

/**
 * Created by Ishaq Hassan on 5/14/2017.
 */
public class Student {
    String name;
    String email;
    int age;

    public Student(String name,int age){
        this(name);
        this.age = age;
        System.out.println("Student Two Args Constructor!");
    }

    public Student(String name,int age,String email){
        this(name,age);
        this.email = email;
        System.out.println("Student Three Args Constructor!");
    }

    public Student(String name){
        this.name = name;
        System.out.println("Student One Args Constructor!");
    }

    public Student(){
        System.out.println("Empty Constructor!");
    }
}
