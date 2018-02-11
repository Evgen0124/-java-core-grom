package lesson22.array;

import java.util.Arrays;

/**
 * Created by user on 11.02.2018.
 */
public class ArrayUtils {
    public static int maxElement(int[] array) {
        int max = array[0];

        for (int el : array) {
            if (el > max)
                max = el;
        }
        return max;
    }

    public static int nCount(int[] array, int n) {
        int count = 0;

        for (int el : array) {
            if (el == n)
                count++;
        }
        return count;
    }
    public static int[] sortAscending(int[] array) {

        Arrays.sort(array);


        return array;

    }

    public static int[] sortDescending(int[] array) {
        int[] result = new int[array.length];


        for (int i = 0, a = result.length - 1; i < array.length; i++, a--) {
            result[a] = array[i];


        }
        return result;


    }
}
