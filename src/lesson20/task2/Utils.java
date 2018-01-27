package lesson20.task2;

/**
 * Created by user on 01.12.2017.
 */
public class Utils {
    private int limitTransactionsPerDayCount = 10;
    private int limitTransactionsPerDayAmount = 100;
    private int limitSimpleTransactionAmount = 40;
    private String[] cities = {"Kiev", "Odessa"};

    public int getLimitTransactionsPerDayCount() {

        return limitTransactionsPerDayCount;
    }

    public int getLimitTransactionsPerAmount() {
        return limitTransactionsPerDayAmount;
    }

    public int getLimitSimpleTransactionsPerAmount() {
        return limitSimpleTransactionAmount;
    }

    public String[] getCities() {
        return cities;
    }
}
