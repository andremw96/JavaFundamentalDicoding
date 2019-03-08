package com.dicoding.javafundamental.nonaccessmodifier;

public class StaticVariable {
    public static void main(String[] args) {
        System.out.println("Dimulai dari " + StaticVariable.nilai);

        for (int x=0; x<5; x++){
            new StaticVariable();
        }

        System.out.println("Sampai " + StaticVariable.nilai);
    }

    // mendeklarasikan variabel atau metode
    // yang berdiri sendiri tanpa perlu instance dari suatu kelas

    // StaticVariable Variable
    // Variabel yang berdiri sendiri tanpa perlu instance dari kelas
    public static int nilai = 0;

    StaticVariable() {
        nilai++;
    }
}
