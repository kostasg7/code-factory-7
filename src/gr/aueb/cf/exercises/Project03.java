package gr.aueb.cf.exercises;

import java.io.*;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Project03 {

    public static void main(String[] args) {
        String filePath = "C:/tmp/f1.txt";
        int[][] charTable = new int[128][2];
            for (int i = 0; i < 128; i++) {
                charTable[i][0] = i;
                charTable[i][1] = 0;
            }
            try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
                int c;
                while ((c = reader.read()) != -1) {
                    if (c < 128 && !Character.isWhitespace(c)) {
                        charTable[c][1]++;
                         }
                }
            } catch (IOException e) {
                e.printStackTrace();
            }

            Arrays.sort(charTable, Comparator.comparingInt(a -> a[0]));
            for (int i = 0; i < 128; i++) {
                 if (charTable[i][1] > 0) {
                     System.out.println((char) charTable[i][0] + ": " + charTable[i][1]); }
        }
    }
}
