package Lesson5;

import java.util.Arrays;

/**
 * Created by user on 11.06.2017.
 */
public class BanksPractice {
    public static void main(String[] args) {
        String[] names = {"Jeck", "Ann", "Denis", "Andrey", "Nicolay", "Irina", "John"};
        int[] balances = {100, 500, 8432, -99, 12000, -54,0};

        System.out.println(Arrays.toString(findClientsByBalance(names, balances, -100)));
        System.out.println(Arrays.toString(findClientsWithNegativeBalance(names, balances)));
depositMoney(names, balances, "Ann", 2000);
        System.out.println(Arrays.toString(balances));

    }

    static String[] findClientsByBalance(String[] clients, int[] balances, int n) {

        int count = 0;
        for (int balance : balances) {
            if (balance >= n)
                count++;

        }
        String[] results = new String[count];

        int index = 0;
        int resindex = 0;
        for (int balance : balances) {

            if (balance >= n) {
                results[resindex] = clients[index];
                resindex++;
            }
            index++;
        }
        return results;
    }


    static String[] findClientsWithNegativeBalance(String[] clients, int[] balances) {

        int count = 0;
        for (int balance : balances) {
            if (balance < 0)
                count++;

        }
        String[] results = new String[count];

        int index = 0;
        int resindex = 0;
        for (int balance : balances) {

            if (balance < 0) {
                results[resindex] = clients[index];
                resindex++;
            }
            index++;
        }
        return results;
    }
   static void  depositMoney(String[] clients, int[]  balances, String client, int money){
        int cleentIndex = 0;
        for (String cl : clients){
            if (cl== client){
                break;
            }
            cleentIndex++;
        }
        int moneyToDrposit = money <= 100 ? (int) (money - money * 0.02) : (int) (money - money * 0.01);
        balances[cleentIndex] += moneyToDrposit;
    }
}