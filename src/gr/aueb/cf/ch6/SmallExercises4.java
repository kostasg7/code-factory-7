package gr.aueb.cf.ch6;

import java.util.Arrays;

public class SmallExercises4 {

    public static void main(String[] args) {
        int[] arr = {0, 1, 4, 4, 4, 6, 7, 8, 8, 8, 8, 8};

        System.out.println(Arrays.toString(getLowAndHighIndexOf(arr, 0)));

    }

    public static int[] getLowAndHighIndexOf(int[] arr, int key) {
    if (key < arr[0] || key > arr.length) return null;
    int[] newArr = new int[2];
    boolean found = false;

    for (int el : arr) {
        if (el == key) {
            found = true;
        }
    }

    for (int i = 0; i < arr.length; i++) {
        if (!found) {
            return null;
        }
    }

    for (int i = 0; i < key - 1; i++) {
        arr[0] = arr[i];
    }
    newArr[0] = arr[0];
    newArr[1] = arr.length - 1;

    return newArr;
    }
}
