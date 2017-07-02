package com.company;

/**
 * Created by Ishaq Hassan on 7/2/2017.
 */
public class MyArr {
    private int[] arr;
    public int count = 0;
    public MyArr(int size){
        arr = new int[size];
    }
    public void add(int data){
        if(count >= arr.length){
            int[] newArr = new int[arr.length*2];
            for(int i = 0;i<arr.length;i++){
                newArr[i] = arr[i];
            }
            arr = newArr;
            //System.out.println("Unable To Add");
        }

        arr[count++] = data;

    }
}
