package com.dicoding.javafundamental.kelas;

public class PropertiDanMetode {
    public static void main(String[] args) {
        // instantiasi manusia dgn umur 10
        Manusia manusia = new Manusia(10);
        manusia.makan();
        manusia.lari();
        manusia.jalan();

        // contoh penggunaan fungsi getUmur
        System.out.println("Umurnya " + manusia.getUmur());

        // perhitungan indeks massa tubuh
        // berat / ( tinggi * tinggi )
        double bmi = manusia.getBerat() / ((manusia.getTinggi() * 0.01) * (manusia.getTinggi() * 0.01));
        System.out.println("Indeks massa tubuhnya adalah " + bmi);
    }

    static class Manusia {
        // properti atau fields
        double tinggi = 30;
        double berat = 3;
        int umur;

        // properti atau fields dengan nilai inisial
        //double tinggiInisial = 30;
        //double beratInisial = 3;

        // inisialisasi melalui konstruktor
        int umurKons;

        // Konstruktor dengan parameter
        Manusia(int umur) {
            //umur = umurParam;

            // bisa juga
            this.umur = umur;
        }

        void lari(){
            System.out.println("Berlari dengan sangat cepat..");
        }

        void jalan(){
            System.out.println("Berjalan denga pelan..");
        }

        void makan(){
            System.out.println("Makan dengan menggunakan mulut..");
        }

        double getBerat() {
            return berat;
        }

        double getTinggi() {
            return tinggi;
        }

        int getUmur() {
            return umur;
        }
    }
}
