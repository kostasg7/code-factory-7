package gr.aueb.cf.ch6;

public class Exercise1 {

    public static void main(String[] args) {
        int[] arr = {99, 46, 15, 59, 18};
        int position = 0;

        position = getMaxPosition(arr, 0, 5);
        System.out.println("The maximum number is in position: " + (position + 1));

//        getMaxPosition(arr, 0, 5);
//        System.out.println(getMaxPosition(arr, 0, 5));

    }

    public static int getMaxPosition(int[] arr, int low, int high) {
        int position = 0;
        int max = 0;

        for (int i = 0; i < high; i++) {
            if (arr[i] > max) {
                max = arr[i];
                position = i;
            }
        }
//        System.out.println("The maximum number is: " + max);
//        System.out.println("The maximum number is in position: " + position + 1);
//        return max;
        return position;
    }
}
