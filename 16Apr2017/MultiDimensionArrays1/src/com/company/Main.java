package com.company;

public class Main {

    public static void main(String[] args) {
        int[] nums = new int[5];
        int[][] data = new int[3][5];
        data[0] = new int[]{1,2,3,4,5};
        data[1] = new int[]{2,3,4,5,6};
        data[2] = new int[]{5,6,7,8,9};
        //System.out.println(data[1][2]);
        for(int r = 0;r<data.length;r++){
            for(int c = 0;c<data[r].length;c++){
                System.out.print(data[r][c]+" ");
            }
            System.out.println("");
        }

    }
}
