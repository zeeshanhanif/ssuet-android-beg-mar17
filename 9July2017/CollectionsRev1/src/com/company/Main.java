package com.company;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Main {

    public static void main(String[] args) {
        ArrayList myGeneralArray = new ArrayList();
        myGeneralArray.add("");
        myGeneralArray.add(2);
        myGeneralArray.add(2.5f);
        myGeneralArray.add(true);
        myGeneralArray.add(true);

        ArrayList<String> myArr = new ArrayList<String>();
        myArr.add("a");
        myArr.add("b");
        myArr.add("c");

        HashMap<String,Integer> hashMap = new HashMap<String,Integer>();
        hashMap.put("Student One",20);
        hashMap.put("Student Two",21);
        hashMap.put("Student Three",22);
        hashMap.put("Student Four",23);
        hashMap.put("Student Five",24);

        //hashMap.get("Student One");

        /*for(String myValue : myArr){
            System.out.println(myValue);
        }*/

        for (String key : hashMap.keySet()){
            System.out.println(hashMap.get(key));
        }

        for(Map.Entry<String,Integer> item : hashMap.entrySet()){
            System.out.println(item.getKey()+" : "+item.getValue());
        }
    }
}
