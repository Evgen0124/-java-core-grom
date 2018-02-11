package lesson22.task2;

import lesson22.task2.exeption.BadRequestException;
import lesson22.task2.exeption.InternalServerException;
import lesson22.task2.exeption.LimitExceeded;

/**
 * Created by user on 01.12.2017.
 */
public class Controller {
    private static TransactionDAO transactionDAO = new TransactionDAO();

    public  static Transaction save(Transaction transaction) throws LimitExceeded, BadRequestException,InternalServerException {
        return transactionDAO.save(transaction);

    }
    public  static Transaction[] transactionList(){
        return  transactionDAO.transactionList();
    }
    public  static Transaction[] transactionList(String city){
        return transactionDAO.transactionList(city);
    }
    public  static  Transaction[] transactionList(int amount){

        return transactionDAO.transactionList(amount);
    }
}
