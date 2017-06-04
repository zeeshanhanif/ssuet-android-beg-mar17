package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Student s = new Student("Student Name",30);
        System.out.println(s);
        System.out.println(s.toString());
        System.out.println(s.getName());
        System.out.println(s.getAge());
    }
}
