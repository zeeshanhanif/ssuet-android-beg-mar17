package com.company;

import java.util.Random;

public class Main {

    public static void main(String[] args) {
        int[] randoms = new int[5];
        Random r = new Random();
        for(int i=0;i<randoms.length;i++){
            randoms[i] = r.nextInt(100);
        }

        for(int j=0;j<randoms.length;j++){
            System.out.println(randoms[j]);
        }
    }


}
