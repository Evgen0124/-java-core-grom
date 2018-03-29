package lesson27;


import java.util.ArrayList;
import java.util.Date;
import java.util.LinkedList;


/**
 * Created by user on 29.03.2018.
 */
public class TestPerformance {
    public static void main(String[] args) {
        testAddMethod();
        testRemoveMethod();
        testGetMethod();
    }

    private static void testGetMethod(){
        //arrayList
        ArrayList<String> arrayList = new ArrayList<>();

        for (int i = 0; i < 100000 ; i++) {
            arrayList.add(i,String.valueOf(i));
        }
        Date start = new Date();
        for (int i = 0; i < 100000 ; i++) {
            arrayList.get(50000);
        }
        Date finish = new Date();
        long diff = finish.getTime() - start.getTime();
        System.out.println("get - array list: " + diff);

        //linkedList
        LinkedList<String> linkedList = new LinkedList<>();

        for (int i = 0; i < 1000000 ; i++) {
            linkedList.add(i,String.valueOf(i));
        }
        Date start1 = new Date();
        for (int i = 0; i < 100000 ; i++) {
            linkedList.get(50000);
        }

        Date finish1 = new Date();

        long diff1 = finish1.getTime() - start1.getTime();
        System.out.println("get - linked list: " + diff1);
    }
    private static void testAddMethod(){
        //arrayList
        ArrayList<String> arrayList = new ArrayList<>();
        Date start = new Date();
        for (int i = 0; i < 100000 ; i++) {
            arrayList.add(i,String.valueOf(i));
        }
        Date finish = new Date();
        long diff = finish.getTime() - start.getTime();
        System.out.println("add - array list: " + diff);

        //linkedList
        LinkedList<String> linkedList = new LinkedList<>();
        Date start1 = new Date();
        for (int i = 0; i < 100000 ; i++) {
            linkedList.add(i,String.valueOf(i));
        }
        Date finish1 = new Date();

        long diff1 = finish1.getTime() - start1.getTime();
        System.out.println("add - linked list: " + diff1);
    }

    private static void testRemoveMethod(){
        //arrayList
        ArrayList<String> arrayList = new ArrayList<>();

        for (int i = 0; i < 100000 ; i++) {
            arrayList.add(i,String.valueOf(i));
        }
        Date start = new Date();
        for (int i = 0; i < 90000 ; i++) {
            arrayList.remove(10000);
        }
        Date finish = new Date();
        long diff = finish.getTime() - start.getTime();
        System.out.println("remove - array list: " + diff);

        //linkedList
        LinkedList<String> linkedList = new LinkedList<>();

        for (int i = 0; i < 1000000 ; i++) {
            linkedList.add(i,String.valueOf(i));
        }
        Date start1 = new Date();
        for (int i = 0; i < 90000 ; i++) {
            linkedList.remove(10000);
        }

        Date finish1 = new Date();

        long diff1 = finish1.getTime() - start1.getTime();
        System.out.println("remove - linked list: " + diff1);
    }
}
