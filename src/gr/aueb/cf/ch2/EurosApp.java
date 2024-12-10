package gr.aueb.cf.ch2;

import java.util.Scanner;

public class EurosApp {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int num;
        int thousands;
        int hundreds;
        int fifties;
        int twenties;
        int decades;
        int euro;
        int remainingEuros;

        System.out.println("Δώστε το ποσό σε €:");
        num = in.nextInt();

        thousands = num / 500;
        remainingEuros = num % 500;
        System.out.println(thousands + " χαρτονομίσματα των 500€");
        hundreds = remainingEuros / 100;
        System.out.println(hundreds + " χαρτονομίσματα των 100€");
        remainingEuros = remainingEuros % 100;
        fifties = remainingEuros / 50;
        System.out.println(fifties + " χαρτονομίσματα των 50€");
        remainingEuros = remainingEuros % 50;
        twenties = remainingEuros / 20;
        System.out.println(twenties + " χαρτονομίσματα των 20€");
        remainingEuros = remainingEuros % 20;
        decades = remainingEuros / 10;
        System.out.println(decades + " χαρτονομίσματα των 10€");
        remainingEuros = remainingEuros % 10;
        System.out.println(remainingEuros + " νομίσματα των 1€");
    }
}
