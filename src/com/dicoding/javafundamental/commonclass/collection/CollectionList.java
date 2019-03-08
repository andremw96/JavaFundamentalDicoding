package com.dicoding.javafundamental.commonclass.collection;

import java.util.ArrayList;

public class CollectionList {
    public static void main(String[] args) {
        // deklarasi Array
        String[] heroes = new String[2];
        heroes[0] = "riki";
        heroes[1] = "sven";
        //heroes[2] = "zeus" // error karena ukuran aray tetap

        // menggunakan ArrayList
        java.util.List planets = new ArrayList();
        planets.add("mercury");
        planets.add("venus");
        planets.add("earth");
        planets.add("mars");

        System.out.println("CollectionList planets awal:");
        for (int i = 0; i < planets.size(); i++) { // method size() untuk mendapatkan ukuran CollectionList
            // method get() untuk melihat isi CollectionList pada index i
            System.out.println("\t index-"+ i +" = " + planets.get(i));
        }

        planets.remove("venus"); // method remove() untuk mengeluarkan objek dari CollectionList

        System.out.println("CollectionList planets akhir:");
        for (int i = 0; i < planets.size(); i++) {
            System.out.println("\t index-"+ i +" = " + planets.get(i));
        }
    }
}
