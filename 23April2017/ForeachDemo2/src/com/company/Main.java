package com.company;

public class Main {

    public static void main(String[] args) {
	    int[][] marks = new int[3][2];
        marks[0][0] = 1;
        marks[0][1] = 2;
        marks[1][0] = 3;
        marks[1][1] = 4;
        marks[2][0] = 5;
        marks[2][1] = 6;

        int[][] arrTwo = new int[3][2];
        arrTwo[0] = new int[]{1,2};
        arrTwo[1] = new int[]{3,4};
        arrTwo[2] = new int[]{5,6};
        int[] singleNormal = new int[3];
        singleNormal[0] = 1;
        int[] singleDimen = new int[]{
          1,2,3
        };
        int[][] shortest = new int[][]{
          new int[]{1,2},
          new int[]{3,4},
          new int[]{5,6},
          new int[]{7,8},
        };







    }
}
