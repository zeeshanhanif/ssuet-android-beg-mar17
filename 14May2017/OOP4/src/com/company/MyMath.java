package com.company;

/**
 * Created by Ishaq Hassan on 5/14/2017.
 */
public class MyMath {
    public int min(int a,int b){
        System.out.println("Min int");
        return (a < b ? a : b);
    }

    public double min(double a,double b){
        System.out.println("Min double");
        return (a < b ? a : b);
    }

    public long min(long a,long b){
        System.out.println("Min long");
        return (a < b ? a : b);
    }

    public void doSomeWork(int a,double b){

    }

    public void doSomeWork(double a,int b){

    }

    public void doSomeWork(double a,int b,float c){

    }
}
