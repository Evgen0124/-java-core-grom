package lesson8.Acounts;

/**
 * Created by user on 03.07.2017.
 */
public class SavingAccount extends  Account{
    int savingPerMonth;

    public SavingAccount(String bankName, String ownerName, int moneyAmount, int savingPerMonth) {
        super(bankName, ownerName, moneyAmount);
        this.savingPerMonth = savingPerMonth;

    }

}
