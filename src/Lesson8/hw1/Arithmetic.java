package Lesson8.hw1;

/**
 * Created by user on 05.07.2017.
 */
public class Arithmetic {
    public boolean check(int[] array) {

        int max = array[0];
        int min = array[0];
        for (int i : array) {
            if (i > max) max = i;
            if (i < min) min = i;
            return max + min > 100;
        }


    }
}
