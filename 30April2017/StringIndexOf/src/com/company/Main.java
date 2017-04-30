package com.company;

public class Main {

    public static void main(String[] args) {
	    String a = "Hello World";
	    /*int indexof = a.indexOf("o");
        System.out.println(indexof);
        System.out.println(a.indexOf("o",indexof+1));*/
	    int index = -1;
        /*for(int i = 0;i<a.length();i++){
            System.out.println("Index : "+i);
            index = a.indexOf("l",index+1);
            System.out.println(index);
        }*/
        for(int i = 0;i<a.length();i++){
            index = a.indexOf("l",index+1);
            System.out.println(index);
            if(index < 0){
                System.out.println("Total Count : "+(i));
                break;
            }
        }
    }
}
