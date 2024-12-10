package gr.aueb.cf.ch6;

import java.util.Arrays;

public class SmallExercises5 {

    public static void main(String[] args) {
        int[][] arr = {{1012, 1136}, {1317, 1417}, {1015, 1020}};
        int i = 1;
        int j = 2;
        int newValue = 1;
        int[] arr2 = new int[arr[i].length];

        for (int k = 0; k < arr.length; k++) {
            arr2[k] = arr[i][k];
        }
        arr2[j] = newValue;

        System.out.println(Arrays.toString(arr2));
    }
}
