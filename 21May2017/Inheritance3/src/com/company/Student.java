package com.company;

/**
 * Created by Ishaq Hassan on 5/21/2017.
 */
public class Student extends Human {
    int rollNo;

    public Student(String name,int age){
        this.name = name;
        this.age = age;
        System.out.println("Student 2 args Constructor");
    }
}
