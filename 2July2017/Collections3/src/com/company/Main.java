package com.company;

import java.util.ArrayList;
import java.util.Hashtable;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Hashtable<String,Integer> hashtable = new Hashtable<String,Integer>();
        hashtable.put("One",100);
        hashtable.put("Two",50);
        hashtable.put("Three",80);

        System.out.println("Value Of One : "+hashtable.get("One"));

        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);

        for(int item : list){
            System.out.println("Item "+ item);
        }
    }
}
