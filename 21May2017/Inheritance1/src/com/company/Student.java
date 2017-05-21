package com.company;

/**
 * Created by Ishaq Hassan on 5/21/2017.
 */
public class Student extends Human{
    int rollNo;

    public Student(int rollNo){
        this.rollNo = rollNo;
    }

    public Student(String name,int age,int rollNo){
        this.name = name;
        this.age = age;
        this.rollNo = rollNo;
    }

    public void study(){
        System.out.println("Student is Studying...");
    }
}
