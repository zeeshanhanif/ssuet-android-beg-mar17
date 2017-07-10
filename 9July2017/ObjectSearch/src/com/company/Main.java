package com.company;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        Student st1 = new Student("Abc",50);
        Student st2 = new Student("Abc",50);

        st1.equals(st2);


        ArrayList<Student> students = new ArrayList<Student>();
        students.add(new Student("StudentOne",20));
        students.add(new Student("StudentTwo",30));
        students.add(new Student("StudentThree",40));

        for(Student student : students){
            System.out.println(student);
        }

        System.out.println(students.contains(new Student("StudentThree",40)));




    }
}
