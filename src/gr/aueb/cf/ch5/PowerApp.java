package gr.aueb.cf.ch5;

public class PowerApp {

    public static void main(String[] args) {
        for (int b = 1, p = 1; b <= 10; b++, p++) {
            System.out.printf("%,d\n", pow(b, p));
        }

//        long num1 = 3;
//        long num2 = 10;
//        long result = 0;
//
//        result = pow(num1, num2);
//        System.out.println(result);
    }

    /**
     * Calculates a^n
     * Delegation / Forwarding
     *
     * @param a     the base
     * @param n     the power
     * @return      the base raised to the power.
     */
    public static long pow(long a, long n) {
//        long result = 1;
//
//        for (int i = 1; i <= n; i++) {
//            result = result * a;
//        }
//        return result;
        return (long) Math.pow(a, n);
    }
}