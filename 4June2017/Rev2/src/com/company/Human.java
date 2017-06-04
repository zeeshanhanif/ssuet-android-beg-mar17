package com.company;

/**
 * Created by Ishaq Hassan on 5/28/2017.
 */
public class Human {
    private String name;
    private int age;

    public Human(String name, int age) {
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

    public void sleep(){
        System.out.println("Human is Sleeping!");
    }

    public void doSomething(int a,String b){
        System.out.println("doSomething in Human!");
    }
}
