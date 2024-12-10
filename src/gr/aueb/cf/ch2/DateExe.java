package gr.aueb.cf.ch2;

import java.util.Scanner;

public class DateExe {

    public static void main(String[] args) {

        int day = 0;
        int month = 0;
        int year = 0;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Εισάγετε την ημέρα: ");
        day = scanner.nextInt();
        System.out.print("Εισάγετε τον μήνα: ");
        month = scanner.nextInt();
        System.out.print("Εισάγετε την χρονολογία: ");
        year = scanner.nextInt();

        System.out.printf("%02d/%02d/%,2d", day, month, year % 100);
    }
}
