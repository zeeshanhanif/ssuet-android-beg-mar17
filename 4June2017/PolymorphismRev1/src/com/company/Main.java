package com.company;

public class Main {

    public static void main(String[] args) {
        Human h = new Human("Human Name",20);
        h.sleep();
        Student s = new Student("Student Name",30);
        s.sleep();

        Human hs = new Student("Student Human Name",40);
        hs.sleep();

        s.doSomething();
        s.doSomething(1,"hello");

        hs.doSomething(2,"World");
    }
}
