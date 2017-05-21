package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Student st1 = new Student("Hello "+20,20,"abc@gmail.com");
        System.out.println(st1.name);
        System.out.println(st1.age);
        System.out.println(st1.email);

        /*Student st2 = new Student("Hello World");
        System.out.println(st2.name);
        System.out.println(st2.age);
        System.out.println(st2.email);*/
    }
}
