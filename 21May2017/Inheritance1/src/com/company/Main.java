package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Human human = new Human();
        human.name = "Usman";
        human.age = 50;
        Student student = new Student("Usman",35,999);
        System.out.println(student.name);
        System.out.println(student.age);
        System.out.println(student.rollNo);
    }
}
