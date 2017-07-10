package com.company;

/**
 * Created by Ishaq Hassan on 7/9/2017.
 */
public class Student {
    String name;
    int age;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Name : "+getName()+", Age : "+getAge();
    }

    @Override
    public boolean equals(Object obj) {
        Student student = (Student) obj;
        return (student.getName().equals(getName()) && student.getAge() == getAge());
    }





}
