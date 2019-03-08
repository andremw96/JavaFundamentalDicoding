package com.dicoding.studikasus.bangundatar;

public class Lingkaran implements BangunDatar{

    private double pi = 3.1415;

    public Lingkaran() {
    }

    @Override
    public double luas(int s1, int s2) {
        return 0;
    }

    @Override
    public double keliling(int s1, int s2) {
        return 0;
    }

    public double luas(int r) {
        // method overload
        return (pi * r * r);
    }

    public double keliling(int r){
        return (2 * pi * r);
    }
}
