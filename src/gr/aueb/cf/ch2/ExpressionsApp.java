package gr.aueb.cf.ch2;

/**
 *  Expressions demo.
 */
public class ExpressionsApp {

    public static void main(String[] args) {

        int num1 = 10;
        int num2 = 20;
        int sum = 0;
        int sub = 0;
        int mul = 0;
        int div = 0;
        int mod = 0;
        int result1 = 0;
        int result2 = 0;

        sum = num1 + num2;
        sub = num1 - num2;
        mul = num1 * num2;
        div = num1 / num2;

        result1 = num1++;   //έστω num1 = 8, result = 8, num1 = 9
        result2 = ++num2;   //έστω num2 = 8, result = 9, num2 = 9

        result1 = result1 * 12;
        result1 *= 12;
    }
}
