package com.dicoding.studikasus.bangundatar;

import java.util.Scanner;

public class Main {
    private static char pilihan;
    private static Scanner scanner = new Scanner(System.in);

    private static void mainMenu() {
        //pilihan menu
        System.out.println("========================");
        System.out.println("Hitung Luas dan Keliling : ");
        System.out.println("1. Persegi Panjang");
        System.out.println("2. Segitiga Siku");
        System.out.println("3. Lingkaran");
        System.out.print("Masukan Menu : ");
        pilihan = scanner.next().charAt(0);
    }

    public static void main(String[] args) {
        // Kamus
        PersegiPanjang oPersegi = new PersegiPanjang();
        SegitigaSiku oSegitiga = new SegitigaSiku();
        Lingkaran oLingkaran = new Lingkaran();
        int s1, s2, r;

        // Program
        // panggil main menu
        mainMenu();

        //kondisional untuk pilihan menu yg dimasukkan
        switch (pilihan) {
            case '1' : {
                System.out.print("Masukkan panjang: ");
                s1 = scanner.nextInt();
                System.out.print("Masukkan lebar: ");
                s2 = scanner.nextInt();
                System.out.println("Luas persegi panjang: " + oPersegi.luas(s1,s2));
                System.out.println("Keliling persegi panjang: " + oPersegi.keliling(s1,s2));
                break;
            }

            case '2' : {
                System.out.print("Masukkan alas: ");
                s1 = scanner.nextInt();
                System.out.print("Masukkan tinggi: ");
                s2 = scanner.nextInt();
                System.out.println("Luas segitiga: " + oSegitiga.luas(s1,s2));
                System.out.println("Keliling segitiga: " + oSegitiga.keliling(s1,s2));
                break;
            }

            case '3' : {
                System.out.print("Masukkan jari - jari: ");
                r = scanner.nextInt();
                System.out.println("Luas Lingkaran: " + oLingkaran.luas(r));
                System.out.println("Keliling Lingkaran: " + oLingkaran.keliling(r));
                break;
            }

            default:{
                System.out.println("tidak ada pilihan");
                break;
            }
        }

    }
}
