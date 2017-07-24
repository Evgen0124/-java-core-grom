package Lesson5;

import java.util.Arrays;

/**
 * Created by user on 11.06.2017.
 */
public class SortArray {
    public static void main(String[] args) {
        int[] array = {1, 22, 12, 9, 6};
        System.out.println(Arrays.toString(sortAscending(array)));
        System.out.println ( Arrays.toString ( sortDescending ( array ) ) );
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



