package gr.aueb.cf.ch5;

import java.util.Scanner;

/**
 * Μεταρέπει τους βαθμούς Κελσίου σε Φαρενάιτ,
 * με είσοδο χρήστη.
 */
public class CelsiusToFahrenheit {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double inputNum;

        System.out.println("Please enter the temperature in celsius");
        inputNum = scanner.nextDouble();

        System.out.println("The temperature in fahrenheit is: " + celsiusToFahrenheit(inputNum));


    }

    public static double celsiusToFahrenheit(double num) {

        num = num * 9 / 5 + 32;
        return num;
    }
}
