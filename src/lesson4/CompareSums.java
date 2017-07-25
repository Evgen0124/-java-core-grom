package lesson4;

/**
 * Created by user on 02.06.2017.
 */
public class CompareSums {

       public boolean  compareSums(int a, int b, int c, int d) {
           return sum(a, b)> sum(c, d);

    }
    public long sum(int a, int b){
        long sum = 0;
        for(long i = a; i<= b; i++){
            sum += i;
        }
        return sum;
    }
}

