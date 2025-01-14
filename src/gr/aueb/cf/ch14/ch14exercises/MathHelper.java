package gr.aueb.cf.ch14.ch14exercises;

public class MathHelper {

    private MathHelper() {

    }

    public static void findMax(int[] arr) {
        int temp = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > temp) {
                temp = arr[i];
            }
        }
        System.out.println(temp);
    }

    public static void findMin(int[] arr) {
        int temp = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++){
            if (arr[i] < temp) {
                temp = arr[i];
            }
        }
        System.out.println(temp);
    }

    public static void findAverage(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        sum /= arr.length;
        System.out.println(sum);
    }
}
