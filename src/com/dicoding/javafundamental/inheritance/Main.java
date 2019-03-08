package com.dicoding.javafundamental.inheritance;

public class Main {
    public static void main(String[] args) {
       /* Hewan hewan = new Hewan(); // memanggil constructor

        System.out.println("Apakah hewan IS-A Objek -> " + (hewan instanceof Object));
        System.out.println("Apakah hewan IS-A Hewan -> " + (hewan instanceof Hewan));
        System.out.println("Apakah hewan IS-A Kucing -> " + (hewan instanceof Kucing));

        System.out.println("------------------------");

        Kucing kucing = new Kucing(); // memanggil constructor
        System.out.println("Apakah hewan IS-A Objek -> " + (kucing instanceof Object));
        System.out.println("Apakah kucing IS-A Hewan -> " + (kucing instanceof Hewan));
        System.out.println("Apakah kucing IS-A Kucing -> " + (kucing instanceof Kucing)); */

      // Hewan hewan = new Hewan();
      // hewan.makan(); // memanggil base method

     //  Kucing kucing = new Kucing();
      // kucing.makan(); // memanggil method overriding
      // kucing.makan("daging ikan"); // memanggil method overloading

      /*  Kucing meow = new Kucing("Ocicat", "tropis");
        Kucing puss = new Kucing("Ocicat", "subtropis");
        Kucing popo = new Kucing("Anggora", "subtropis");

        System.out.println(meow.toString());
        System.out.println(puss.toString());
        System.out.println(popo.toString());

        System.out.println("meow equals puss ? " + meow.equals(puss));
        System.out.println("meow equals popo ? " + meow.equals(popo));*/

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
}
