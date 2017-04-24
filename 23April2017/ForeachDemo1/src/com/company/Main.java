package com.company;

public class Main {

    public static void main(String[] args) {
	    int[] nums = new int[]{1,2,3,4};
        char[] chars = new char[]{'a','b','c','d'};


        for(char chr : chars){
            System.out.println("Char is now "+chr);
        }

        for(int num : nums){
            System.out.println("Num Is Now : "+num);
        }

        for(int i = 0;i<nums.length;i++){
            System.out.println("Num Is : "+nums[i]);
        }
    }
}
