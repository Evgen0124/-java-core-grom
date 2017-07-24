package lesson2;

/**
 * Created by user on 03.04.2017.
 */
public class SumOfNumbers {
    public static void main(String[] args) {
        int n = 0;
        long sum = 0;
        while (n <= 10000000) {
            sum += n;
            n++;
        }        System.out.println(sum);
    }
}