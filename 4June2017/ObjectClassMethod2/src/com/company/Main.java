package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Student s = new Student("Usama",30);
        Student s1 = new Student("Usama",30);
        System.out.println(s == s1);
        System.out.println(s.equals(s1));

    }
}
