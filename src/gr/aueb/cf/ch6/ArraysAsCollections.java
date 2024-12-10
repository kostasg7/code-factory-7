package gr.aueb.cf.ch6;

import javax.swing.plaf.IconUIResource;

public class ArraysAsCollections {

    public static void main(String[] args) {

    }

    public static int[] getEvens(int[] arr) {
        int count = 0;

        for (int el : arr) {
            if (el % 2 == 0) count++;
        }

        int[] evens = new int[count];

        int pivot = 0;
        for (int el : arr) {
            if (el % 2 == 0) {
                evens[pivot] = el;
                pivot++;
            }
        }
        return evens;
    }

//    public static int[] mapToDouble(int[] arr) {
//        int count = 1;
//
//        for (int el : arr) {
//            count++;
//        }
//
//        return new int[count * 2];
//    }

    public static int[] mapToDouble(int[] arr) {
        int[] mapped = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {
            mapped[i] = arr[i] * 2;
        }
        return mapped;
    }

    public static int sum(int[] arr) {
        int sum = 0;

        for (int el : arr) {
            sum += el;
        }
        return sum;
    }

    public static double avg(int[] arr) {
//        double sum = 0;
//        int count = 0;
//
//        for (int el : arr) {
//            sum += el;
//            count++;
//        }
//        return sum / (double) count;

        return sum(arr) / (double) arr.length;
    }

    public static boolean anyEven(int[] arr) {
//        for (int el : arr) {
//            if (el % 2 == 0) {
//                return true;
//            }
//        }
//        return false;
        boolean isAnYEven = false;

        for (int el : arr) {
            if (el % 2 == 0) {
                isAnYEven = true;
                break;
            }
        }
        return isAnYEven;
    }

    public static boolean moreThanTwoEvens(int[] arr) {
        int count = 0;

        for (int el : arr) {
            if (el % 2 == 0) count++;
        }
        return count > 2;
    }

    public static boolean moreThanTwoConsecutive(int[] arr) {
        int count = 0;

        for (int i = 0; i < arr.length - 2; i++) {
            if (arr[i] == arr[i+1] - 1 && arr[i] == arr[i+2] - 2){
                count++;
                break;
            }
        }
        return count >= 1;
    }

    public static boolean moreThanTwoWithSameEnding(int[] arr) {
        int[] endings = new int[10];
        boolean isSameEnding = false;

        for (int num : arr) {
            endings[num % 10]++;
        }

        for (int count : endings) {
            if (count >= 3) {
                isSameEnding = true;
                break;
            }
        }
        return isSameEnding;
    }

    public static boolean allAreEven(int[] arr) {
//        return getEvens(arr).length == arr.length;
        boolean allEven = false;
        int count = 0;

        for (int el : arr) {
            if (el % 2 == 0) count++;
        }

        return count == arr.length;
    }
}