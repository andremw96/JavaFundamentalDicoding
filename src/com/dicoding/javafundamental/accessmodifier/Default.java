package com.dicoding.javafundamental.accessmodifier;

public class Default {
    private int memberA = 5;

    char memberB = 'A';
    double memberC = 1.5;

    private int functionA() {
        return memberA;
    }

    int functionB() {
        // Pemanggilan private member dan private function
        int hasil = functionA() + memberA;
        return hasil;

    }

    // memberB, memberC, dan functionB termasuk default modifier
}
