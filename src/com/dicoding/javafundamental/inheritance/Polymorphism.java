package com.dicoding.javafundamental.inheritance;

public class Polymorphism {
    public void main(String[] args) {
        Object o = new Kucing(); // kucing adalah Object
        Hewan h = new Kucing(); // kucing adalah Hewan
        Kucing k = new Kucing(); // kucing adalah Kucing

        //o.makan(); -> error, karena method makan() tidak ada di class Object
        h.makan();
        k.makan();

        Object object = k;
        Hewan hewan = k;

        //object.makan(); -> error, karena method makan() tidak ada di class Object
        hewan.makan();

        Kucing kucing = (Kucing) h;
        kucing.makan();

        Hewan harimau = new Hewan();
        Kucing anggora = (Kucing) harimau;
    }

    class Hewan {
        public void makan() {
            System.out.println("Hewan sedang makan");
        }
    }

    class Kucing extends Hewan {
        public void makan() { // overriding
            System.out.println("Kucing sedang makan..");
        }
        public void makan(int food) { // overloading
            System.out.println("Kucing makan " + food);
        }
    }
}
