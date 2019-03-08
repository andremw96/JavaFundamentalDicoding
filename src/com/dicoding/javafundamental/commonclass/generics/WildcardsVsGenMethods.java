package com.dicoding.javafundamental.commonclass.generics;

import java.util.ArrayList;
import java.util.Collection;

public class WildcardsVsGenMethods {

    // menggunakan wildcards
    static void print(Collection<?> collection) {
        for (Object o : collection) {
            System.out.println(o);
        }
    }

    // menggunakan generic mthods
    static <T> Collection arrayToCollection(T[] a) {
        Collection<T> c = new ArrayList<>();
        for(T o : a){
            c.add(o);
        }
        return c;
    }

    public static void main(String[] args) {
        String[] sa = {"Happy", "Coding"};

        Collection r = arrayToCollection(sa);

        print(r);
    }
}
