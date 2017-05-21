package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Student st1 = new Student();
        st1.name = "Hello";
        st1.email = "Hello@world.com";
        System.out.println(st1.name);
        System.out.println(st1.email);
        System.out.println("============");
        Student st2 = new Student();
        st2.name = "World";
        st2.email = "world@hello.com";
        System.out.println(st2.name);
        System.out.println(st2.email);
        System.out.println("============");
        Student.course = "Java";
        st1.getCourse();
        st2.getCourse();
        st1.course = "Advance Android";
        st1.getCourse();
        st2.getCourse();
    }
}
