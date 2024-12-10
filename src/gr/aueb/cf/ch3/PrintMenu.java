package gr.aueb.cf.ch3;

import java.util.Scanner;

public class PrintMenu {

    public static void main(String[] args) {

        int num;
        Scanner in = new Scanner(System.in);
        boolean choice = true;

        System.out.println("""
                1. Εισαγωγή
                2. Διαγραφή
                3. Ενημέρωση
                4. Αναζήτηση
                5. Έξοδος""");

        System.out.print("\nΠαρακαλώ επιλέξτε: ");
        while (choice){
            num = in.nextInt();
            if (num < 1 || num > 5) {
                System.out.println("Επιλέξτε ξανά");
            }
            if (num == 1) {
                System.out.println("Επιλέξατε Εισαγωγή");
            }
            else if (num == 2) {
                System.out.println("Επιλέξατε Διαγραφή");
            }
            else if (num == 3) {
                System.out.println("Επιλέξατε Ενημέρωση");
            }
            else if (num == 4) {
                System.out.println("Επιλέξατε Αναζήτηση");
            }
            else if (num == 5){
                System.out.println("Έξοδος");
                choice = false;
            }
        }
    }
}
