package com.company;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        ArrayList arrayList = new ArrayList();
        System.out.println("ArrayList Size : "+arrayList.size());
        arrayList.add(20);
        arrayList.add(30);
        arrayList.add(40);
        arrayList.add(50);
        arrayList.add(60);
        System.out.println("ArrayList Size : "+arrayList.size());
        arrayList.add(70);
        arrayList.add(80);
        arrayList.add(90);
        System.out.println("ArrayList Size : "+arrayList.size());
        System.out.println("Contains 40 : "+arrayList.contains(40));
        System.out.println("Contains 102 : "+arrayList.contains(102));
        System.out.println("Index Of 50 : "+arrayList.indexOf(50));
        arrayList.remove(3);
        System.out.println("Contains 50 : "+arrayList.contains(50));

    }
}
