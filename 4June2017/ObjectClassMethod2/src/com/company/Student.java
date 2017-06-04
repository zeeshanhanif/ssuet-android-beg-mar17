package com.company;

/**
 * Created by Ishaq Hassan on 6/4/2017.
 */
public class Student {
    private String name;
    private int age;

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
        return "Name = "+this.name+", Age = "+this.age;
    }

    @Override
    public boolean equals(Object obj) {
        Student st = (Student)obj;
        return (st.name.equals(this.name) && st.age == this.age);
    }
}
