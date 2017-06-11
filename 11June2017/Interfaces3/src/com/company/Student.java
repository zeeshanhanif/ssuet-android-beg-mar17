package com.company;

/**
 * Created by Ishaq Hassan on 6/11/2017.
 */
public class Student extends Human implements Sindhi,Pakistani {
    public void doSomething(){
        System.out.println("Student doSomething");
    }

    @Override
    public void hardWorker() {
        System.out.println("hardWorker in Student");
    }
}
