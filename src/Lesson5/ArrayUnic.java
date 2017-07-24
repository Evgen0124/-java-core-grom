package Lesson5;

/**
 * Created by user on 11.06.2017.
 */
public class ArrayUnic { public static void main( String[] args){
    int[] array = { 1, 2, 3, 4, 5, 5, 5, 6, 6, 7 };
    System.out.println (  uniqueCount (array) );

}

    public static int uniqueCount( int[] array) {
        boolean mas[] = new boolean[array.length];
        int removeCount = 0;

        for (int i = 0; i < array.length; i++) {
            if (!mas[i]) {
                int temp = array[i];

                for (int j = i + 1; j < array.length; j++) {
                    if (temp == array[j]) {
                        mas[j] = true;
                        removeCount++;
                    }
                }
            }
        }

        int[] result = new int[array.length - removeCount];

        for (int i = 0, j = 0; i < array.length; i++) {
            if (!mas[i]) {
                result[j++] = array[i];
            }
        }
        return result.length;
    }



}


