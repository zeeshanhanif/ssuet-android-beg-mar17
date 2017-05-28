package com.company;

/**
 * Created by Ishaq Hassan on 5/28/2017.
 */
public class Teacher extends Human {
    public Teacher(String name, int age) {
        super(name, age);
    }
    public void prepareExam(){
        System.out.println("Teacher is preparing exam!");
    }
}
