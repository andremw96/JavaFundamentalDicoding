package com.dicoding.javafundamental.commonclass.collection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class CollectionSet {
    // Set mirip dengan List hanya saja objek di dalam Set tidak bisa diduplikasi
    //  jika objek yang sama dimasukkan beberapa kali ke dalam Set maka Set hanya akan menyimpan objek tersebut satu kali saja
    // penyimpanan pada Set tidak teratur.

    public static void main(String[] args) {
        // menggunakan HashSet
        Set<String> planets = new HashSet<>();
        planets.add("mercury");
        planets.add("venus");
        planets.add("earth");
        planets.add("earth"); // menambahkan objek "earth" beberapa kali
        planets.add("earth");
        planets.add("mars"); // objek bisa terus ditambahkan ke Set

        System.out.println("Set planets awal: (size = "+ planets.size() +")");
        for (String planet : planets) {
            System.out.println("\t " + planet);
        }

        planets.remove("venus"); // method remove() untuk mengeluarkan objek dari Set

        System.out.println("Set planets akhir: (size = "+ planets.size() +")");
        for (Iterator iterator = planets.iterator(); iterator.hasNext();) {
            // looping menggunakan Iterator
            System.out.println("\t " + iterator.next());
        }
    }
}
