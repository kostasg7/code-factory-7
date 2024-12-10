package gr.aueb.cf.ch3;

import java.util.Scanner;

/**
 * Δικαίωμα ψήφου σε ηλικίες > 18.
 * Ελέγχει αν μια ηλικία έχει δικαίωμα
 * να ψηφίσει.
 */
public class VoteEligible {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int inputAge = 0;
        final int AGE = 18;
        boolean isEligible = false;

        System.out.println("Insert the age: ");
        inputAge = scanner.nextInt();
        isEligible = inputAge >= AGE;

        System.out.printf("Is eligible to vote: %b", isEligible);
    }
}
