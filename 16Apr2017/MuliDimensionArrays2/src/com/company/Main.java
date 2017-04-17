package com.company;

public class Main {

    public static void main(String[] args) {
	    int[][] data = new int[3][];
        data[0] = new int[4];
        data[1] = new int[8];
        data[2] = new int[2];
        for(int i = 0;i<data.length;i++){
            for(int j = 0;j<data[i].length;j++){
                System.out.print(data[i][j]+" ");
            }
            System.out.println("");
        }
    }
}
