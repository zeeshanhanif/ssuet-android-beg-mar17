package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Pakistani pakistani = new Student();
        pakistani.doStudy();

        Pakistani pakistani1 = new Pakistani(){
            @Override
            public void doStudy() {
                System.out.println("doStudy in pakistani1");
            }
        };

        pakistani1.doStudy();

        Pakistani pakistani2 = new Pakistani() {
            @Override
            public void doStudy() {
                System.out.println("Hello World");
            }
        };
    }
}
