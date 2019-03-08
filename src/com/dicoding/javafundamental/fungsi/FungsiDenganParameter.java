package com.dicoding.javafundamental.fungsi;

public class FungsiDenganParameter {
    public static void main(String[] args) {
        double p = 7;
        double l = 6.5;

        // fungsi dengan parameter
        hitungLuasPersegiPjg(p, l);
    }

    // fungsi dengan parameter
    public static void hitungLuasPersegiPjg(double panjang, double lebar) {
        double luas = panjang * lebar;
        System.out.println(luas);
    }
}
