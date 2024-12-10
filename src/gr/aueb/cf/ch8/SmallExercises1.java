package gr.aueb.cf.ch8;

import java.util.Scanner;

public class SmallExercises1 {

    public static void main(String[] args) {

        try {
            menu();
            getChoice();
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }

    public static void menu() {
        System.out.println("""
                1. Select 1 for:
                2. Select 2 for:
                3. Select 3 For:
                4. Select 4 for:
                5. Select 5 for exit.""");
    }

    public static int getChoice() {
        Scanner scanner = new Scanner(System.in);

        while (!scanner.hasNextInt()) {
            System.out.println("Error input must be int.");
            scanner.nextLine();
        }
        int num = scanner.nextInt();

        try {
            switch (num) {
                case 1:
                    System.out.println("You selected option 1");
                    break;
                case 2:
                    System.out.println("You selected option 2");
                    break;
                case 3:
                    System.out.println("You selected option 3");
                    break;
                case 4:
                    System.out.println("You selected option 4");
                    break;
                case 5:
                    System.out.println("Exit");
                    break;
                default: break;
            }
            if (num < 1 || num > 5) {
                throw new IllegalArgumentException("Number must be 1 to 5");
            }

        }catch (IllegalArgumentException e) {
            System.err.println("Error. " + e.getMessage());
            throw e;
        }
        return num;
    }
}
