package com.dicoding.studikasus;



import org.jetbrains.annotations.NotNull;

import java.util.Scanner;

public class VokalKonsCount {
    public static void main(String[] args) {

        // Kamus
        String word = "";
        int vokal = 0;
        int konsonan = 0;

        // Program
        //masukkan kalimat
        System.out.print("Masukkan kalimat : ");
        Scanner scanner = new Scanner(System.in);
        word = scanner.nextLine();

        vokal = num_vokal(word);
        konsonan = num_konsonan(word);

        System.out.println("Jumlah huruf vokal : " + vokal);
        System.out.println("Jumlah huruf konsonan : " + konsonan);
    }

    private static int num_vokal(@NotNull String word) {
        int i;
        int jml_vokal = 0;

        for(i=0; i<word.length(); i++) {
            if(word.charAt(i) == 'a' || word.charAt(i) == 'i' ||
                    word.charAt(i) == 'u' || word.charAt(i) == 'e' ||
                    word.charAt(i) == 'o') {
                jml_vokal++;
            }
        }
        return jml_vokal;
    }

    private static int num_konsonan(@NotNull String word) {
        int i;
        int jml_konsonan = 0;

        for(i=0; i<word.length(); i++) {
            if(word.charAt(i) != 'a' && word.charAt(i) != 'i' &&
                    word.charAt(i) != 'u' && word.charAt(i) != 'e' &&
                    word.charAt(i) != 'o') {
                jml_konsonan++;
            }
        }
        return jml_konsonan;
    }

}
