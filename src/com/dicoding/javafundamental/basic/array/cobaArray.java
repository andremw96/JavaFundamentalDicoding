package com.dicoding.javafundamental.basic.array;

public class cobaArray {
    void cobaArray() {
        double[] arrA = new double[10];
    }

    void kumpulanInteger() {
        int[] arrInt = new int[] {1, 2, 3, 4, 5, 6};

        int[] arrInt2 = new int[6];
        arrInt2[0] = 1;
        arrInt2[1] = 2;

        int[] arrInt3 = {1,2,3,4,5,6};
        System.out.println(arrInt3[0]);
    }

    void loopingArray() {
        int[] arrInt = new int[10000];

        for(int i = 0; i<=arrInt.length; i++) {
            arrInt[i] = i++;
        }

        for(int i = 0; i<=arrInt.length; i++) {
            System.out.print(arrInt[i]);
        }
    }
}