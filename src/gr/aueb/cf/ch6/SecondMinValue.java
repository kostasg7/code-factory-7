package gr.aueb.cf.ch6;

/**
 * Finds the second minimum number.
 */
public class SecondMinValue {

    public static void main(String[] args) {
        int position = 0;
        int[] arr = {97, 46, 15, 59, 16};

        position = getSecondMin(arr);
        System.out.println(position);
    }

    public static void swap(int[] arr, int i, int j) {
        int tmp = arr[i];
        arr[i] = arr[j];
        arr[j] = tmp;
    }

    public static int getSecondMin(int[] arr) {
        int position = 0;
//        int min = Integer.MAX_VALUE;
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
            position = arr[1];
        }
        return position;
    }
}
