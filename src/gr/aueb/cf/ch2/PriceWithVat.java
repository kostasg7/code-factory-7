package gr.aueb.cf.ch2;

import java.util.Scanner;

/**
 * Calculates the price with vat.
 */

public class PriceWithVat {

    public static void main(String[] args) {

        final double VAT = 0.24;
        double inputPrice = 0.0;
        double priceWithVat = 0.0;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Insert price");
        inputPrice = scanner.nextDouble();

        priceWithVat = inputPrice * VAT;
        priceWithVat += inputPrice;

        System.out.println(priceWithVat);
    }
}
