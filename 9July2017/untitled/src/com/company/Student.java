package com.company;

/**
 * Created by Ishaq Hassan on 7/30/2017.
 */
public class Student {
    String name;
    int age;
    Student(String n,int a){
        name = n;
        age = a;
    }

    public void study(){
        System.out.println(age);
    }

    public void setAge(int a){
        age = a;
    }

    public String getAge(){
        return "Your Age is : "+age;
    }
}
