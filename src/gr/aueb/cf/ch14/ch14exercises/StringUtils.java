package gr.aueb.cf.ch14.ch14exercises;

/**
 * Utility class for string manipulation.
 */
public class StringUtils {

    private StringUtils() {

    }

    public static void reverse(String str) {
        String reverse = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            reverse += str.charAt(i);
        }

        System.out.println(reverse);
    }

    public static void uppercase(String str) {
        System.out.println(str.toUpperCase());
    }

    public static void regress(String str) {
        for (int i = 0, j = str.length() - 1; i <= str.length() / 2 &&  j >= str.length() / 2; i++, j--) {
            if (str.charAt(i) != str.charAt(j)) {
                System.out.println("The string is not a palindrome");
                return;
            }
        }
        System.out.println("The string is a palindrome");
    }
}
