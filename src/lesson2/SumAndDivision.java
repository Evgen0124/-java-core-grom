package lesson2;

/**
 * Created by user on 03.04.2017.
 */
public class SumAndDivision {
    public static void main(String[] args) {
        int n = 1;
        long sum = 1;
        while (n <= 1000) {
            sum += n;
            n++;
        }

        long b = 1234;
        long e = sum / b;
        long c = sum % b;
        while (e > c){
            System.out.println(false);
        }
        while (e < c){
            System.out.println(true);
            break;
        }



    }
}
