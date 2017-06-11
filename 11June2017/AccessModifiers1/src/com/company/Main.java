package com.company;

import com.company.xyz.Teacher;

public class Main {

    public static void main(String[] args) {
        Human h = new Human("Abc","abc@xyz.com",30,1030);
        h.email = "hello@abc.com";
        System.out.println(h.age);
        System.out.println(h.email);
        System.out.println(h.rollNo);

        Teacher t = new Teacher();
    }
}
