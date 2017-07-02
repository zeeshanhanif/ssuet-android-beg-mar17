package com.company;

public class Main {

    public static void main(String[] args) {
	    int[] nums = new int[5];
        nums[0] = 10;
        nums[1] = 20;
        nums[2] = 30;
        nums[3] = 40;
        nums[4] = 50;

        MyArr myArr = new MyArr(5);
        System.out.println("Count Is : "+myArr.count);
        myArr.add(50);
        myArr.add(60);
        myArr.add(70);
        System.out.println("Count Is : "+myArr.count);
        myArr.add(80);
        System.out.println("Count Is : "+myArr.count);
        myArr.add(90);
        System.out.println("Count Is : "+myArr.count);
        myArr.add(100);
        System.out.println("Count Is : "+myArr.count);
    }
}
