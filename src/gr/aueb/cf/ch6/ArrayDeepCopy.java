package gr.aueb.cf.ch6;

import java.util.Arrays;

public class ArrayDeepCopy {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int[] copied;

        System.out.print(Arrays.toString(arr));
        copied = arrDeepCopy(arr);
        System.out.print(Arrays.toString(copied));
    }

    /**
     * it does a fresh copy (deep copy) of an array.
     * @param source    the source array.
     * @return          the copied array.
     */
    public static int[] arrDeepCopy(int[] source) {
        int[] destination = new int[source.length];

        for (int i = 0; i < source.length; i++) {
            destination[i] = source[i];
        }
//        System.arraycopy(source, 0, destination, 0, source.length);
//        destination = Arrays.copyOf(source, source.length);
//        destination = Arrays.copyOfRange(source, 0, source.length);

        return destination;
    }
}
