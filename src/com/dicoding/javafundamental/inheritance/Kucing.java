package com.dicoding.javafundamental.inheritance;

public class Kucing extends Hewan {
    public Kucing() {
        super();  // akan tetap memanggil constructor dari parent Class

        System.out.println("construct Kucing");
    }

    // overriding / mengubah isi metode
    public void makan() {
        System.out.println("Kucing sedang makan");
    }

    // overloading; menambah metode sejenis (nama yang sama tetapi berbeda parameter).
    public void makan(String food) {
        System.out.println("Kucing makan " + food);
    }
}

/*public class Kucing {
    private String ras;
    private String habitat;

    public Kucing(String ras, String habitat) {
        this.ras = ras;
        this.habitat = habitat;
    }

    @Override
    public String toString() {
        return "Kucing{" +
                "ras='" + ras + '\'' +
                ", habitat='" + habitat + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Kucing) {
            Kucing other = (Kucing) obj;
            return this.ras.equals(other.ras);
        } else {
            return false;
        }
    }
}*/
