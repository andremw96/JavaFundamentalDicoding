package com.dicoding.javafundamental.nonaccessmodifier;

public class Synchronized {
    // digunakan untuk membatasi akses ke suatu variable/methods yang hanya boleh dilakukan oleh satu thread
    // Ketika ada 2 thread yang ingin mengakses synchronized variable/methods, maka prosesnya akan dilakukan secara serial (bergantian).

    public synchronized void showData() {

    }
}
