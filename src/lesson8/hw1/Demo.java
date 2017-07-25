package lesson8.hw1;

/**
 * Created by user on 04.07.2017.
 */

public class Demo extends Adder{
    public static void main ( String[] args ) {
        Adder adder1 = new Adder ();
        adder1.check ( new int[]{25, 10, 15, 2, 3} );
        adder1.add (10,25);
    }

}
