package com.company;

public class Main {

    public static void main(String[] args) {
        String abc = "Hello";
        abc = "World";
	    Student st = new Student();
        Student st1 = new Student();
        Student st2 = new Student();
        System.out.println(st.name);
        System.out.println(st1.name);
        System.out.println(st2.name);
        st.name = "Parkash";
        st1.name = "Hammad";
        st1.age = 30;
        System.out.println("===========");
        System.out.println(st.name);
        System.out.println(st1.name);
        System.out.println(st1.age);
        System.out.println(st2.name);

    }
}
