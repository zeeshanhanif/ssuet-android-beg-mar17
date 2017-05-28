package com.company;

public class Main {

    public static void main(String[] args) {
        Human h = new Human("Usama",20);
        Human h1 = new Student("Parkash",50);
        Human h2 = new Teacher("Hassan",50);
        System.out.println(h1.getName());
        h1.sleep();
        h2.sleep();
        Student st1 = (Student) h1;
        /*long a = 20;
        int b = (int)a;*/
        st1.study();
        //h1.study();
        //h2.prepareExam();
        /*Student st2 = (Student) h2;
        st2.study();*/

    }
}
