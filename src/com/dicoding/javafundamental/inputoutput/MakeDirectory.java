package com.dicoding.javafundamental.inputoutput;

import java.io.File;

public class MakeDirectory {
    public static void main(String[] args) {
        String dirname = "/java/latihan1";
        File file = new File(dirname);

        // Karena menggunakan mkdirs, kode di atas akan membuat directory latihan1 dan parent directory java.
        file.mkdirs();
    }
}
