package Lesson8.Acounts;

/**
 * Created by user on 03.07.2017.
 */
public class Demo {
    public static void main(String[] args) {
        SavingAccount savingAccount = new SavingAccount("someBank", "Denis", 1000,50 );
        savingAccount.depositMoney(100);
        System.out.println(savingAccount.moneyAmount);
    }
}
