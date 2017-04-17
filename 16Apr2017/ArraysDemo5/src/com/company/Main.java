package com.company;

import java.util.Random;

public class Main {

    public static void main(String[] args) {
        Random random = new Random();
        int values[] = new int[5];
        for(int i = 0;i<values.length;i++){
            values[i] = random.nextInt(100);
        }

        for(int j = 0;j<values.length;j++) {
            System.out.print(values[j] + " ");
            for(int jj = 0;jj<values.length;jj++)
            {
                if(values[jj] < values[j]){
                    values[j] = values[jj];
                }
            }
        }
    }
}
