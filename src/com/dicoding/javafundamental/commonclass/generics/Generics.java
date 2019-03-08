package com.dicoding.javafundamental.commonclass.generics;

import java.util.ArrayList;
import java.util.List;

public class Generics {
    public static void main(String[] args) {
        List lo = new ArrayList(); //List lo tanpa type-parameter
        lo.add("lo - String - 1"); //lo menampung objek string
        lo.add(new Planet("Mercury", 0.06)); //lo menampung objek planet

        // code ini akan eror, karena object bukan planet
        for (Object o : lo) {
            Planet p = (Planet) o; //perlu type casting dari object ke Planet
            p.print();
        }

        List<Planet> lp = new ArrayList(); // list lp dengan type-parameter planet
        lp.add(new Planet("Mercury", 0.06)); //lp menampung objek planet
        //lp.add("lp - String 1"); // eror, lp tidak menampung objek string
        lp.add(new Planet("Venus", 0.82));
        for (Planet p : lp) {
            p.print();
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

    public void print() {
        System.out.println("Planet " + name + "mass: " + mass);
    }

    @Override
    public String toString() {
        return "Planet " + name + ", mass: " + mass;
    }
}