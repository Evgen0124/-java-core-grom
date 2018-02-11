package lesson22.task2;

/**
 * Created by user on 01.12.2017.
 */
public class Utils {
    private  static  int limitTransactionsPerDayCount = 10;
    private  static  int limitTransactionsPerDayAmount = 100;
    private  static  int limitSimpleTransactionAmount = 40;
    private  static  String[] cities = {"Kiev", "Odessa"};

    public  static  int getLimitTransactionsPerDayCount() {

        return limitTransactionsPerDayCount;
    }

    public  static int getLimitTransactionsPerAmount() {
        return limitTransactionsPerDayAmount;
    }

    public static  int getLimitSimpleTransactionsPerAmount() {
        return limitSimpleTransactionAmount;
    }

    public  static  String[] getCities() {
        return cities;
    }
}
