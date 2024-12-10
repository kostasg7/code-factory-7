package gr.aueb.cf.ch8;

import java.util.Scanner;

public class StateTestingApp {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int numerator = 0;
        int denominator = 0;
        int result = 0;

        System.out.println("Please insert numerator");
        while (!in.hasNextInt()) {      // State-test
            System.out.println("Error input must be int. Please insert numerator");
            in.nextLine();  // Για να καταναλωθεί το input
        }
        numerator = in.nextInt();

        System.out.println("Please insert denominator");
        while (!in.hasNextInt()) {
            System.out.println("Error input must be int. Please insert denominator");
            in.nextLine();  // Για να καταναλωθεί το input
        }
        denominator = in.nextInt();

        if (denominator == 0) {     // State-test
            System.out.println("Error. Must not be zero.");
            System.exit(1);     // Μόνο το System.exit(0) δεν διακόπτει με error
        }

        result = numerator / denominator;
        System.out.printf("%d / %d = %d\n", numerator, denominator, result);
    }
}
