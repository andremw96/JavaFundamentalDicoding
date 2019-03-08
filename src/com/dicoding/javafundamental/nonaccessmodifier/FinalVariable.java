package com.dicoding.javafundamental.nonaccessmodifier;

public class FinalVariable {
    //hanya bisa diinisiasi sekali.
    //tidak dapat diganti dengan objek lainnya.

    final int nilai = 5;

    void ubahNilai(){

        // Kode di bawah akan menampilkan error
        //nilai = 10;

    }

    class Lingkaran {
        // Biasanya final digunakan bersamaan dengan static untuk membuat suatu konstanta
        static final double PI = 3.141;
    }
}
