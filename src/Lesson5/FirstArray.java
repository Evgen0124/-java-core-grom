package Lesson5;

import java.util.Arrays;

/**
 * Created by user on 10.06.2017.
 */
public class FirstArray {
    public static void main(String[] args) {
    int a;
        a = 10;

        int [] firstArray = new int[3];
        System.out.println(Arrays.toString(firstArray));
        firstArray [0] = 11;
        firstArray [1] = 200;
        firstArray [2] = -10;

         for (int i = 0; i <firstArray.length; i++)
        System.out.println(firstArray[i]);

    }


}
