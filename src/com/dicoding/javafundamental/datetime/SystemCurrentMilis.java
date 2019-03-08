package com.dicoding.javafundamental.datetime;

public class SystemCurrentMilis {
    public static void main(String[] args) {
        long timeNow = System.currentTimeMillis();

        System.out.println("Waktu sekarang adalah " + timeNow + " milisecond");
    }
}
