package com.dicoding.javafundamental.fungsi;

public class FungsiDenganNilaiBalik {
    public static void main(String[] args) {

        // fungsi dengan nilai balik
        double p = 7;
        double l = 6.5;
        double hasil = hitungLuas(p, l);
        System.out.println("Luasnya adalah = " + hasil);
    }

    // fungsi dengan nilai balik
    public static double hitungLuas(double panjang, double lebar) {
        double luas = panjang * lebar;
        return luas;
    }
}
