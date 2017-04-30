package com.company;

public class Main {

    public static void main(String[] args) {
        String[] names = new String[]{
                "Zeeshan","Hello","World","Usman","Ishaq","Zain","Zeishan"
        };

        System.out.println("Before");
        System.out.println("=======");
        for(String name : names){
            System.out.println(name);
        }
        System.out.println("=======");
        for(int i=0;i<names.length;i++){
            for(int j=0;j<i;j++){
                String curName = names[i];
                if(curName.compareTo(names[j]) < 0){
                    names[i] = names[j];
                    names[j] = curName;
                }
            }
        }
        System.out.println("After");
        System.out.println("=======");
        for(String name : names){
            System.out.println(name);
        }
    }
}
