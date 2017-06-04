package com.company;

public class Main {

    public static void main(String[] args) {
        Human h = new Human("Human Name",20);
        Student s = new Student("Student Name",30);
        Human hs = new Student("Student Human Name",40);
        long a = 1;
        long b = 2;
        s.doSomething(a,"hello");
        hs.doSomething(0,"World");
    }
}
