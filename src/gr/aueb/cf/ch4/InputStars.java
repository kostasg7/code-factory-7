package gr.aueb.cf.ch4;

import java.util.Scanner;

public class InputStars {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int horizontal = 0;
        int vertical = 0;

        System.out.println("Παρακαλώ δώστε το πλήθος των οριζόντιων αστεριών: ");
        horizontal = scanner.nextInt();
        System.out.println("Παρακαλώ δώστε το πλήθος των κάθετων αστεριών: ");
        vertical = scanner.nextInt();

        //Οριζόντια
//        for (int i = 1; i <= horizontal; i++) {
//            System.out.print("*");
//        }

        //Κάθετα
//        for (int j = 1; j <= vertical; j++) {
//            System.out.println("*");
//        }

        //Οριζόντια και κάθετα
        for (int i = 1; i <= horizontal; i++) {
            for (int j = 1; j <= vertical; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        //Από 1 έως n
//        for (int i = 1; i <= horizontal; i++) {
//            for (int j = 1; j <= i; j++) {
//                System.out.print("*");
//            }
//            System.out.println();
        }
        //Από n έως 1
//        for (int i = 1; i <= horizontal; i++) {
//            for (int j = horizontal; j >= i; j--) {
//                System.out.print("*");
//            }
//            System.out.println();
//        }
//    }
}
