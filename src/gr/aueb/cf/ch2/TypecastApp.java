package gr.aueb.cf.ch2;

public class TypecastApp {

    /**
     * Typecast demo.
     */
    public static void main(String[] args) {
        int num1 = 10;  // int literals -> int -> 32-bit
        long num2 = 20L;

        num1 = (int) num2;
    }
}
