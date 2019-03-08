package com.dicoding.javafundamental.accessmodifier;

public class Main {
    public static void main(String[] args) {
        Private privateA = new Private();

        // memberA dan functionA dari kelas privateA
        // tidak bisa dipanggil karena private modifier

        Default defaultA = new Default();

        System.out.println(defaultA.memberB);
        System.out.println(defaultA.memberC);

        System.out.println(defaultA.functionB());

        // memberB dan memberC dan functionB dari kelas defaultA
        // bisa dipanggil karena default modifier
        // tetapi default modifier tidak bisa dipanggil
        // jika beda package

    }
}
