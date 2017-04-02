package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        char c = 'U';
        switch (c){
            case 'A':
                System.out.println("A is vowel");
                break;
            case 'E':
                System.out.println("E is vowel");
            case 'I':
                System.out.println("I is vowel");
                break;
            case 'O':
                System.out.println("O is vowel");
                break;
            case 'U':
                System.out.println("U is vowel");
            default:
                System.out.println("Not vowel");
                break;
        }
    }
}
