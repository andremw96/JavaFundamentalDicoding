package com.dicoding.javafundamental.nonaccessmodifier;

public class StaticMethods {
    // Metode yang berdiri sendiri tanpa perlu instance dari kelas

    public static void main(String[] args) {
        System.out.println("Getnilai memiliki nilai " + StaticMethods.getNilai());

    }

    public static int nilai = 0;

    protected static int getNilai(){
        return nilai;
    }

    StaticMethods(){
        nilai++;
    }
}
