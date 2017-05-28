package com.company;

public class Main {
    public static void main(String[] args) {
        Student.abc();

        Student st = new Student();
        st.name = "Hello";
        st.age = 20;
        Student.courseName = "Android";
        System.out.println(st.name);
        System.out.println(st.age);
        System.out.println(st.courseName);
        System.out.println(Student.courseName);
        Student st2 = new Student();
        System.out.println(st2.courseName);
        Student.courseName = "Java";
        System.out.println(st.courseName);
        System.out.println(st2.courseName);
        System.out.println("=================");
        System.out.println(st.getName());
        System.out.println(st.getAge());
        System.out.println(Student.getCourseName());
        System.out.println(st.getCourseName());
    }
}
