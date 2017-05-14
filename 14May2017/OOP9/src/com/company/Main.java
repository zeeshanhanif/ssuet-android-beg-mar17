package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Student stu = new Student("Usman",40);
        System.out.println(stu.name);
        System.out.println(stu.age);
        System.out.println(stu.email);

        Student stu1 = new Student("Arbaz");
        System.out.println(stu1.name);
        System.out.println(stu1.age);
        System.out.println(stu1.email);

        /*Student stu2 = new Student("Hello",50,"abc@xyz.com");
        System.out.println(stu2.name);
        System.out.println(stu2.age);
        System.out.println(stu2.email);

        Student stu3 = new Student();
        System.out.println(stu3.name);
        System.out.println(stu3.age);
        System.out.println(stu3.email);*/

    }
}
