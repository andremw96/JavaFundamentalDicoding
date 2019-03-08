package com.dicoding.javafundamental.nonaccessmodifier;

import java.io.Serializable;

public class Transient implements Serializable {
    // memiliki hubungan dengan proses serialisasi (serializing)
    // Serialisasi adalah proses konversi suatu objek menjadi byte agar dapat ditransmisikan.
    // Variabel yang dideklarasikan sebagai transient maka akan tidak dijaga nilainya di dalam proses serialisasi

    // Variabel ini tidak akan dijaga nilainya
    transient int nilaiA;

    // Variabel ini akan dijaga nilainya
    double nilaiB;
    String nilaiC;
}
