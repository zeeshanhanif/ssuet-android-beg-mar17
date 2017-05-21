package com.company;

/**
 * Created by Ishaq Hassan on 5/21/2017.
 */
public class Student {
    String name;
    int age;
    Course course;

    public Student(String name,int age){
        this.name = name;
        this.age = age;
    }

    public Student(String name,int age,Course course){
        this.name = name;
        this.age = age;
        this.course = course;
    }
}
