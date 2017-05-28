package com.company;

public class Main {

    public static void main(String[] args) {
        Human h = new Human("Usama",20);
        Human h1 = new Student("Parkash",50);
        Human h2 = new Teacher("Hassan",50);
        System.out.println(h1.getName());
        h1.sleep();
        h2.sleep();

    }
}
