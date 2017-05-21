package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Human human = new Human("Usman",30);
        Student student = new Student();
        System.out.println(student.name);
        System.out.println(student.age);
        Student student1 = new Student("Usman",40);
        System.out.println(student1.name);
        System.out.println(student1.age);
    }
}
