package gr.aueb.cf.ch20;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Password {

    private static final String PASSWORD_PATTERN =
            "^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d)(?=.*[#?!@$%^&*-]).{8,}$";
    private static final Pattern pattern = Pattern.compile(PASSWORD_PATTERN);
    public static boolean validatePassword(String password) {
        return pattern.matcher(password).matches();
    }

    public static void main(String[] args) {
        String s = "KosTas123#";

        if (validatePassword(s)) {
            System.out.println("Το password είναι έγκυρο.");
        } else {
            System.out.println("Το password δεν πληροί τα κριτήρια.");
        }
    }
}
