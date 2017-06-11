package com.company;

/**
 * Created by Ishaq Hassan on 6/11/2017.
 */
public class Student extends Human implements Pakistani, Sindhi {
    public void doSomething(){
        System.out.println("Student doSomething");
    }

    @Override
    public void hardWorker() {
        System.out.println("Hard Worker");
    }

    @Override
    public void mehmanNawaz() {
        System.out.println("mehmanNawaz");
    }
}
