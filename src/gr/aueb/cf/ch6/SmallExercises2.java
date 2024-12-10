package gr.aueb.cf.ch6;

import java.util.Arrays;

public class SmallExercises2 {

    public static void main(String[] args) {
        int[] arr = {5, 63, 15, -25, 67, 227};
        int position;
        int[] arr2;

        position = findPosition(arr, 2);
        System.out.println("The element is in position: " + position);
        printEvens(arr);
        System.out.println();
//        System.out.println(Arrays.toString(mapping(arr)));
//        System.out.println(positive(arr));
        System.out.println(elementIsPositive(arr));
    }

    //Finds elements position.
    public static int findPosition(int[] arr, int pos) {
        int position = 0;

        for (int i = 0; i < arr.length; i++) {
            if (pos == arr[i]) {
                position = i + 1;
                break;
            } else position = -1;
        }
        return position;
    }

    // Prints even number in array.
    public static void printEvens(int[] arr) {

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                System.out.print(arr[i] + " ");
            }
        }
    }

    // Maps elements of array with double value.
    public static int[] mapping(int[] arr) {
        int[] mapped = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {
            mapped[i] = arr[i] * 2;
        }
        return mapped;
    }

    // Finds if there is even 1 positive in the array.
    public static boolean positive(int[] arr) {

        for (int el : arr) {
            if (el > 0) {
                return true;
            }
        }return false;
    }

    public static boolean elementIsPositive(int[] arr) {

        for (int el : arr) {
            if (el < 1) {
                return false;
            }
        }
        return true;
    }
}
