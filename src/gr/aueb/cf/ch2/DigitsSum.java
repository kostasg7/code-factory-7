package gr.aueb.cf.ch2;

import java.util.Scanner;

/**
 * Λαμβάνει ως input από τον χρήστη ένα
 * διψήφιο ακέραιο και υπολογίζει και
 * εκτυπώνει το άθροισμα των ψηφίων του.
 * Για παράδειγμα, αν ο χρήστης δώσει τον ακέραιο
 * 15, θα πρέπει το αποτέλεσμα να είναι
 * 1 + 5 = 6.
 */

public class DigitsSum {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int num;
        int leftDigit;
        int rightDigit;
        int sum;

        System.out.println("Δώστε ένα διψήφιο αριθμό");
        num = scanner.nextInt();

        leftDigit = num / 10;
        rightDigit = num % 10;
        sum = leftDigit + rightDigit;

        System.out.printf("Input num: %d, Left digit: %d, Right digit: %d, Sum: %d ",num, leftDigit, rightDigit, sum);
    }
}
