package com.dicoding.javafundamental.commonclass.collection;

import java.util.HashMap;
import java.util.Map;

public class CollectionMap {
    // struktur data dalam bentuk pasangan key-value.
    public static void main(String[] args) {
        // menggunakan HashMap
        Map<String, Planet> planets = new HashMap<>();
        planets.put("key-1", new Planet("Mercury", 0.06));
        planets.put("key-2", new Planet("Venus", 0.82));
        planets.put("key-3", new Planet("Earth", 1.00));
        planets.put("key-4", new Planet("Mars", 0.11));
        planets.put("key-4", new Planet("Mars-X", 0.11)); // menambahkan ke Map dengan key yang sama

        System.out.println("Map planets awal: (size = "+ planets.size() +")");
        for (String key : planets.keySet()) {// looping key dari Map
            // method get untuk melihat isi map berdasark key
            System.out.println("\t " + key + " : " + planets.get(key));
        }

        planets.remove("key-2");

        System.out.println("Map planets akhir: (size = "+ planets.size() +")");
        for (Planet planet : planets.values()) {// looping value dari Map
            System.out.println("\t " + planet );
        }
    }
}

class Planet {
    private String name;
    private double mass;

    public Planet(String name, double mass) {
        this.name = name;
        this.mass = mass;
    }

    @Override
    public String toString() {
        return "Planet " + name + ", mass: " + mass;
    }
}