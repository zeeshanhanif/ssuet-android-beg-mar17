package com.company;

/**
 * Created by Ishaq Hassan on 5/21/2017.
 */
public class MyMath {

    private MyMath(){}

    public static int min(int a,int b){
        return (a > b ? b : a);
    }
    public static int max(int a,int b){
        return (a > b ? a : b);
    }
}
