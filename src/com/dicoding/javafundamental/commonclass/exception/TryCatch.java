package com.dicoding.javafundamental.commonclass.exception;

import java.io.File;
import java.io.FileReader;

public class TryCatch {
    public static void main(String[] args) {
        try {
            // Protected code
            File file = new File("D://namafile.txt");
            FileReader fr = new FileReader(file);

            System.out.println("Read file berhasil");
        } catch (Exception e) {
            // catch block
            System.out.println(e.getMessage());
        }
    }
}
