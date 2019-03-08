package com.dicoding.javafundamental.nonaccessmodifier;

public class FinalMethods {
    // tidak dapat di override oleh anak kelas
    // Ini akan berguna jika kita ingin membuat metode yang tidak dapat diubah

    static final double PI = 3.141;
    int jari = 7;

    final double getLuas() {

        return PI * (jari * jari);

    }
}
