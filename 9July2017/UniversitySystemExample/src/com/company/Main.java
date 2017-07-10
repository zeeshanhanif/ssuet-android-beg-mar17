package com.company;

public class Main {

    public static void main(String[] args) {
	    University university = new University("SSUET");
        university.admitStudent(new Student("Student One",20,123));
        university.admitStudent(new Student("Student Two",30,456));
        university.admitStudent(new Student("Student Three",40,789));
        university.admitStudent(new Student("Student Four",50,111));

        //university.displayStudents();

        //System.out.println(university.searchStudent(56565));
        Student sts = university.searchStudent("Student Four");
        System.out.println();

    }
}








