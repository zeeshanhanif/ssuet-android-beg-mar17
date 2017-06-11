package com.company;

/**
 * Created by Ishaq Hassan on 6/11/2017.
 */
public class Human extends Object {
    private String name;
    private int age;

    public Human(String name,int age) {
        this.age = age;
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

    @Override
    public String toString() {
        return "Name : "+name+", Age : "+age;
    }

    @Override
    public boolean equals(Object obj) {
        Human anotherObject = (Human)obj;
        return (anotherObject.getName().equals(name) && anotherObject.getAge() == age);
    }
}
