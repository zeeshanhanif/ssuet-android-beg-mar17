package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Course course = new Course("Android");
        Student st1 = new Student("Hello",21,course);
        System.out.println(st1.name);
        System.out.println(st1.age);
        System.out.println(st1.course);
        System.out.println(st1.course.name);
    }
}
