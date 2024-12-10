package gr.aueb.cf.ch5;

import java.util.Scanner;

/**
 * Επιστρέφει τον μεγαλύτερο από 3 ακεραίους.
 */
public class FindMax {

    public static void main(String[] args) {
        int number;

        number = findMax();
        System.out.println("The greatest number is: " + number);
    }

    public static int findMax() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter 3 numbers");
        int first = scanner.nextInt();
        int second = scanner.nextInt();
        int third = scanner.nextInt();
        int maxInt;

        maxInt = Math.max(first, second);
        maxInt = Math.max(maxInt, third);
        return maxInt;
    }
}
