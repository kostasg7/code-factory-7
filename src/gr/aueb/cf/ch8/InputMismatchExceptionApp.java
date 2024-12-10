package gr.aueb.cf.ch8;

import java.util.InputMismatchException;
import java.util.Scanner;

public class InputMismatchExceptionApp {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int inputNum = 0;

        while (true) {
            try {
                System.out.println("Please insert an int");
                inputNum = in.nextInt();
                if (inputNum == 12) break;
                System.out.println("Input number: " + inputNum);
            } catch (InputMismatchException e) {
                in.nextLine();
//                e.printStackTrace();
                System.out.print("Error in input, ");
            }
        }
    }
}
