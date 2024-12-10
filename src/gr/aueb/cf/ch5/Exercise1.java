package gr.aueb.cf.ch5;

import java.util.Scanner;

/**
 * Prints stars according to user's choice.
 */
public class Exercise1 {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        int choice = 0;

        while (true){
            printMenu();
            choice = getOneInt();

            if(!isChoiceValid(choice)) {
                System.out.println("Error. Choice must be between 1-6. Try again.");
                continue;
            }

            if (choice == 6) {
                System.out.println("Έξοδος...");
                break;
            }

            getResultOnChoice(choice);
        }
    }

    public static int getOneInt() {
        return scanner.nextInt();
    }

    public static void printMenu() {
        System.out.println("""
                1. Εμφάνισε αστεράκια οριζόντια
                2. Εμφάνισε αστεράκια κάθετα
                3. Εμφάνισε n γραμμές με n αστεράκια
                4. Εμφάνισε n γραμμές με αστεράκια 1 έως n
                5. Εμφάνισε n γραμμές με αστεράκια n έως 1
                6. Έξοδος από το πρόγραμμα
                Δώσε επιλογή
                """);
    }

    public static int getStarsNum(int num) {
        System.out.println("Δώσε αριθμό για αστεράκια");
        return num = scanner.nextInt();
    }

    public static boolean isChoiceValid(int choice) {

        return choice >= 1 && choice <= 6;
    }

    public static void getResultOnChoice(int choice) {

        switch (choice) {
            case 1: horizontal();
            break;
            case 2: vertical();
            break;
            case 3: horAndVert();
            break;
            case 4: oneToN();
            break;
            case 5: NtoOne();
            break;
            default:
                System.out.println("Error in choice");
                break;
        }
    }

    public static void horizontal() {
        int num = 0;

        num = getStarsNum(num);
        for (int i = 1; i <= num; i++) {
            System.out.print("*");
        }
        System.out.println();
    }

    public static void vertical() {
        int num = 0;

        num = getStarsNum(num);
        for (int i = 1; i <= num; i++) {
            System.out.println("*");
        }
    }

    public static void horAndVert() {
        int num = 0;

        num = getStarsNum(num);

        for (int i = 1; i <= num; i++) {
            for (int j = 1; j <= num; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void oneToN() {
        int num = 0;

        num = getStarsNum(num);

        for (int i = 1; i <= num; i++){
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void NtoOne() {
        int num = 0;

        num = getStarsNum(num);

        for (int i = 1; i <= num; i++){
            for (int j = i; j <= num; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
