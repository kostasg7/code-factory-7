package gr.aueb.cf.ch14.ch14exercises;

public class ValidationUtils {

    private ValidationUtils() {
    }

    public static void stringValid(String message) {
        int count = 0;

        if (message.isEmpty()) {
            System.out.println("The string is empty!");
            return;
        }

        for (int i = 0; i < message.length(); i++) {
            count++;
            if (count > 31) {
                System.out.println("The string has more than 31 chars.");
                return;
            }
        }
        System.out.println("The string has " + count + " chars");
    }

    public static void numValid(int num) {
        if (num < 1 || num > 10) {
            System.out.println("The number " + num + " is not between 1 & 10");
            return;
        } else {
            System.out.println("The number " + num + " is between 1 & 10");
        }

    }
}
