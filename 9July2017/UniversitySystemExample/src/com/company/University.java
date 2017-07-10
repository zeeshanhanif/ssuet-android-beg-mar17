package com.company;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * Created by Ishaq Hassan on 7/9/2017.
 */
public class University {
    private String name;
    private HashMap<Integer,Student> students;

    public University(String name){
        this.name = name;
        students = new HashMap<Integer,Student>();
    }

    public void admitStudent(Student student){
        students.put(student.getId(),student);
    }

    public String getName() {
        return name;
    }

    public HashMap<Integer, Student> getStudents() {
        return students;
    }

    public void displayStudents(){
        for(Student student : students.values()){
            System.out.println(student);
        }
    }

    public Student searchStudent(int id){
        return students.get(id);
    }

    public Student searchStudent(String name){
        ArrayList<Student> allStudents = new ArrayList<Student>();
        allStudents.addAll(students.values());

        int indexOfStudent = allStudents.indexOf(new Student(name));
        return allStudents.get(indexOfStudent);
    }

}












