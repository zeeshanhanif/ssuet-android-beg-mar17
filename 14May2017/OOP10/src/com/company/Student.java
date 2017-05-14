package com.company;

/**
 * Created by Ishaq Hassan on 5/14/2017.
 */
public class Student {
    String name;
    String email;
    int age;

    public Student(String name,int age){
        this.name = name;
        this.age = age;
        System.out.println("Student Two Args Constructor!");
        this.sleep();
    }

    public void study(){
        System.out.println("Student is Studying");
        this.sleep();
    }

    public void sleep(){
        System.out.println(name+" is Sleeping ");
    }
}
