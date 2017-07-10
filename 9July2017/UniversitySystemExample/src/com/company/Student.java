package com.company;

/**
 * Created by Ishaq Hassan on 7/9/2017.
 */
public class Student {
    private int id;
    private String name;
    private int age;

    public Student(String name, int age,int id) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    public Student(String name) {
        this.name = name;
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

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public boolean equals(Object obj) {
        Student student = (Student) obj;
        return (student.getName().equals(this.getName()));
    }

    @Override
    public String toString() {
        return "ID : "+getId()+", Name : "+getName()+", Age : "+getAge();
    }


}
