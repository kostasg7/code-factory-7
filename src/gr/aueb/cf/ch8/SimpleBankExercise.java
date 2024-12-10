package gr.aueb.cf.ch8;

import java.util.Scanner;

public class SimpleBankExercise {

    static double balance = 500;
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        while (true) {
            System.out.println("---Simple Bank Menu---");
            System.out.println("1. Deposit Money");
            System.out.println("2. Withdraw Money");
            System.out.println("3. Check Balance");
            System.out.println("4. Exit");
            System.out.print("Choose an option: ");

            int choice = scanner.nextInt();

            try {
                switch (choice) {
                    case 1:
                        deposit(-50);
                        break;
                    case 2:
                        withdraw(600);
                        break;
                    case 3:
                        System.out.println("Current balance: " + balance);
                    case 4:
                        System.out.println("Thank you for using Simple Bank. Goodbye!");
                        return;
                    default:
                        System.out.println("Invalid option. Please choose again.");
                }
            } catch (IllegalArgumentException e) {
                throw new RuntimeException(e.getMessage());
            }

        }
    }

    public static void withdraw(double amount) {


        try {
            if (amount < 0 || amount > balance) {
                throw new IllegalArgumentException("Incorrect amount");
            }
            balance -= amount;
            System.out.println("Withdrawal completed");
        } catch (IllegalArgumentException e) {
            System.err.println("Error " + e.getMessage());
//            throw new RuntimeException(e);
        }
    }

    public static void deposit(double amount) {
        try {
            if (amount <= 0) {
                throw new IllegalArgumentException("Amount must be positive.");
            }
            balance += amount;
            System.out.println("Successfully deposited: " + amount);
        } catch (IllegalArgumentException e) {
            System.err.println("Error. " + e.getMessage());
            throw e;
        }
    }
}
