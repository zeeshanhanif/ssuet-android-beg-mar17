package com.company;

/**
 * Created by Ishaq Hassan on 6/11/2017.
 */
public class Student extends Human implements Sindhi {
    public void doSomething(){
        System.out.println("Student doSomething");
    }

    @Override
    public void mehmanNawaz() {
        System.out.println("mehmanNawaz");
    }

    @Override
    public void hardWorker() {
        System.out.println("hardWorker");
    }

    @Override
    public void farming() {
        System.out.println("farming");
    }
}
