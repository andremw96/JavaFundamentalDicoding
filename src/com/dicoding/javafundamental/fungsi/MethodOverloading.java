package com.dicoding.javafundamental.fungsi;

public class MethodOverloading {
    public static void main(String[] args) {
        //method overloading
        double pg = 7;
        double le = 6.5;
        double hasill = hitungLuas2(pg,le);
        System.out.println("Hasilnya adalah = " + hasill);
        int pn = 7;
        int lb = 6;
        int hsll = hitungLuas2(pn,lb);
        System.out.println("Hasilnya adalah = " + hsll);
    }

    // method overloading
    // nama fungsi sama dengan parameter berbeda
    public static double hitungLuas2(double panjang, double lebar){
        double luas = panjang * lebar;
        return luas;
    }

    public static int hitungLuas2(int panjang, int lebar){
        int luas = panjang * lebar;
        return luas;
    }
}
