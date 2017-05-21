package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Human human = new Human();
        human.name = "Usman";
        human.age = 50;
        Student student = new Student();
        student.name = "Hello";
        student.age = 35;
        student.rollNo = 999;
        System.out.println(student.name);
        System.out.println(student.age);
        System.out.println(student.rollNo);
        student.sleep();
        student.study();
        System.out.println("====================");
        System.out.println(human.name);
        System.out.println(human.age);
        human.sleep();
    }
}
