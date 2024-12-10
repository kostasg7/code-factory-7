package gr.aueb.cf.ch2;

import java.util.Locale;
import java.util.Scanner;

public class DateTimeToSecondsConverter {

    public static void main(String[] args) {

        int days = 0;
        int hours = 0;
        int minutes = 0;
        int secs = 0;
        int totalSecs = 0;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Δώστε ημέρες");
        days = scanner.nextInt();
        System.out.println("Δώστε ώρες");
        hours = scanner.nextInt();
        System.out.println("Δώστε λεπτά");
        minutes = scanner.nextInt();
        System.out.println("Δώστε δευτερόλεπτα");
        secs = scanner.nextInt();

        days = days * 86400;
        hours = hours * 3600;
        minutes = minutes * 60;
        totalSecs = days + hours + minutes + secs;
        System.out.printf(Locale.US,"Το σύνολο των δευτερωλέπτων είναι %,d\n", totalSecs);
    }
}
