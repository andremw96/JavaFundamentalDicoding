package com.dicoding.javafundamental.accessmodifier;

public class Private {
    private int memberA = 5;

    private int functionA() {
        return memberA;
    }

    // memberA dan functionA private
    // hanya dpt dipanggil di class ini

    int functionB() {
        // Pemanggilan private member dan private function
        int hasil = functionA() + memberA;
        return hasil;
    }
}
