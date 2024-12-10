package gr.aueb.cf.ch6;

/**
 * Επιστρέφει τον μέγιστο από έναν πίνακα.
 */
public class MaxPosition {

    public static void main(String[] args) {
        int[] arr = {1000, 699, 156, 8, 25, 6, 96};

        System.out.println("The max number is in position: " +
                getMaxPosition(arr, arr[0], arr.length-1));
    }

    public static int getMaxPosition(int[] arr, int low, int high) {
        int max = 0;
        int position = 0;

        for (int i = 0; i < arr.length; i++) {
            if (max < arr[i]) {
                max = arr[i];
                position = i + 1;
            }
        }
        return position;
    }
}
