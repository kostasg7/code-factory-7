package gr.aueb.cf.exercises;

import java.util.Scanner;

public class Encryption {
    static Scanner scanner =new Scanner(System.in);

    public static void main(String[] args) {

        encryption();
//        decryption();
//
//        caesarEncryption();
//        caesarDecryption();
    }

    public static void encryption() {

        System.out.println("Please enter the string");
        String word = scanner.nextLine();
        for (int i = 0; i < word.length(); i++) {
            char character = word.charAt(i);
            System.out.print(Character.toChars(character + 1));
        }
    }

    public static void decryption() {

        System.out.println("Please enter the string");
        String word = scanner.nextLine();
        for (int i = 0; i < word.length(); i++) {
            char character = word.charAt(i);
            System.out.print(Character.toChars(character - 1));
        }
    }

    public static void caesarEncryption() {

        System.out.println("Please enter the string");
        String word = scanner.nextLine();
        System.out.println("Please enter the key");
        int key = scanner.nextInt();
        for (int i = 0; i < word.length(); i++) {
            char character = word.charAt(i);
            System.out.print(Character.toChars(character + key));
        }
    }

    public static void caesarDecryption() {

        System.out.println("Please enter the string");
        String word = scanner.nextLine();
        System.out.println("Please enter the key");
        int key = scanner.nextInt();
        for (int i = 0; i < word.length(); i++) {
            char character = word.charAt(i);
            System.out.print(Character.toChars(character - key));
        }
    }
}
