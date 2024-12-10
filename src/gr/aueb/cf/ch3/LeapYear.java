package gr.aueb.cf.ch3;

import java.util.Scanner;

public class LeapYear {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int year;
        boolean leapYear = false;

        System.out.print("Δώσε έτος: ");
        year = in.nextInt();
        if ((year % 4 == 0) && (year % 100 != 0)) {
            leapYear = true;
        }
        if (year % 400 == 0) {
            leapYear = true;
        }
        System.out.println(leapYear);
    }
}
