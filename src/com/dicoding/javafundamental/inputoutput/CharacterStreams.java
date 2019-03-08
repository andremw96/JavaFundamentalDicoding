package com.dicoding.javafundamental.inputoutput;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CharacterStreams {
    // memproses input output dari 16-bit unicode.
    public static void main(String[] args) {
        FileReader in = null;
        FileWriter out = null;

        try {
            in = new FileReader("latihan_input.txt");
            out = new FileWriter("latihan_output.txt");

            int c;
            while ((c = in.read()) != -1) {
                out.write(c);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (in != null) {
                    in.close();
                }
                if (out != null) {
                    out.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
