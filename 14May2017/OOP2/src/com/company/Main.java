package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        MyMath mm = new MyMath();
        int min = mm.min(10,20);
        if(min < 15){
            System.out.println(min*2);
        }else{
            System.out.println(min*3);
        }
        System.out.println("In Main : "+min);
    }
}
