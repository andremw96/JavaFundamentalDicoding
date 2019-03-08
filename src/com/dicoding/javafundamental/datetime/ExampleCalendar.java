package com.dicoding.javafundamental.datetime;

import java.util.Calendar;

public class ExampleCalendar {
    public static void main(String[] args) {
        // menampilkan waktu sekarng
        Calendar calendar = Calendar.getInstance();
        System.out.println("Waktu sekarang adalah " + calendar.getTime());

        // menampilkan spesifik waktu yg diinginkan
        System.out.println("Tanggal : " + calendar.get(Calendar.DATE));
        System.out.println("Bulan   : " + calendar.get(Calendar.MONTH));
        System.out.println("Tahun   : " + calendar.get(Calendar.YEAR));

        // menampilkan 15 hari lalu
        calendar.add(Calendar.DATE, -15);
        System.out.println("15 hari lalu: " + calendar.getTime());

        //menampilkan 4 bulan datang
        calendar.add(Calendar.MONTH, 4);
        System.out.println("4 bulan kemudian: " + calendar.getTime());

        // menampilkan 2 taun mendatang
        calendar.add(Calendar.YEAR, 2);
        System.out.println("2 taun kemudian: " + calendar.getTime());
    }
}
