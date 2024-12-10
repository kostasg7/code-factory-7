package gr.aueb.cf.ch5;

import java.util.Scanner;

/**
 * Υπολογίζει το τετράγωνο ενός ακεραίου.
 */
public class Square {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int inputNum;

        inputNum = scanner.nextInt();

        System.out.println(square(inputNum));
    }

    public static int square(int num) {
        num = num * num;
        return num;
    }
}
