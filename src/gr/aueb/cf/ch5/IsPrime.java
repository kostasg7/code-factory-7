package gr.aueb.cf.ch5;

import java.util.Scanner;

/**
 * Επιστρέφει true αν ένας ακέραιος είναι prime
 * false αν όχι.
 */
public class IsPrime {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int number;
        boolean prime;

        System.out.println("Please insert a number");
        number = scanner.nextInt();

        prime = isPrime(number);
        System.out.println(prime);
    }

    public static boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }
        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
}
