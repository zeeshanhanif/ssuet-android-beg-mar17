package com.company;

public class Main {

    public static void main(String[] args) {
	    int length = 10;
	    int[] nums = new int[length];
        int counter = 0;
	    for(int i=1;;i++){
	        boolean isPrime = true;
	        for(int j = 2;j<i;j++){
	            if(i%j == 0){
	               isPrime = false;
	               break;
                }
            }
            if(isPrime){
                nums[counter] = i;
                counter++;
                if(counter == length){
                    break;
                }
            }
        }

        for (int prime : nums){
            System.out.println("Prime Num : "+prime);
        }
    }
}
