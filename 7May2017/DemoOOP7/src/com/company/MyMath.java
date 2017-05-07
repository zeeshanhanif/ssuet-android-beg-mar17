package com.company;

/**
 * Created by Ishaq Hassan on 5/7/2017.
 */
public class MyMath {
    public void max(int a,int b){
        int c = (a > b ? a : b);
        System.out.println(c);
    }

    public int min(int a,int b){
        int c = (a < b ? a : b);
        return c;
    }
}
