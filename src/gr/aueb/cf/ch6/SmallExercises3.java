package gr.aueb.cf.ch6;

import java.util.Arrays;
import java.util.Scanner;

public class SmallExercises3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] arr = new int[6];

        System.out.println("Παρακαλώ εισάγετε 6 αριθμούς μεταξύ του 1 και 49");
        for (int i = 0; i < 6; i++) {
            arr[i] = scanner.nextInt();
//            if (arr[i] < 1 || arr[i] > 49) {
//                System.out.println("Λάθος αριθμός");
//                break;
//            }
        }
//        System.out.println(Arrays.toString(arr));
        System.out.println("Has more than 3 evens: " + checkEvens(arr));
//        System.out.println("Has more than 3 odds: " + checkOdds(arr));
        System.out.println("Has 3 consecutive numbers: " + consecutive(arr));
        System.out.println(sameEnd(arr));
    }

    public static boolean checkEvens(int[] arr) {
        int count = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                count++;
            }
        }
        if (count > 3) {
            return true;
        }
        return false;
    }

//    public static boolean checkOdds(int[] arr) {
//        int count = 0;
//
//        for (int i = 0; i < arr.length; i++) {
//            if (arr[i] % 2 != 0) {
//                count++;
//            }
//        }
//        if (count > 3) {
//            return true;
//        }
//        return false;
//    }
//
    public static boolean consecutive(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] == arr[i+1] - 1 && arr[i] == arr[i+2] - 2) {
                return true;
            }
        }
        return false;
    }

    public static boolean sameEnd(int[] arr) {
        int[] copyArr = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {
            copyArr[i] = arr[i] % 10;
        }
        selectionSort(copyArr);
        for (int i = 0; i < arr.length - 1; i++) {
            if (copyArr[i] == arr[i+1]&& copyArr[i] == arr[i+2]) {
                return true;
            }
        }
        return false;
//        System.out.println(Arrays.toString(copyArr));
//        return true;
    }

    public static int[] selectionSort(int[] arr) {

        for (int i = 0; i < arr.length - 1; i++) {

            int minPosition = i;
            int minValue = arr[minPosition];

            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < minValue) {
                    minValue = arr[j];
                    minPosition = j;
                }
            }
            swap(arr, minPosition, i);
        }
        return arr;
    }

    public static void swap(int[] arr, int i, int j) {
        int tmp = arr[i];
        arr[i] = arr[j];
        arr[j] = tmp;
    }
}
