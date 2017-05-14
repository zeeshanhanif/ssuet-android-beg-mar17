package com.company;

/**
 * Created by Ishaq Hassan on 5/14/2017.
 */
public class MyMath {
    public int min(int a,int b){
        System.out.println(a+" : "+b);
        int min = (a < b ? a : b);
        System.out.println(min);
        return min;
    }
}
