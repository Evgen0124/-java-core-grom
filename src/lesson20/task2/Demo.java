package lesson20.task2;

import java.util.Arrays;
import java.util.Date;

/**
 * Created by user on 27.01.2018.
 */
public class Demo {
    public static void main(String[] args) {
        Transaction transaction0 = new Transaction(123, "Poltava", 45, "nnn", TransactionType.INCOME, new Date());
        Transaction transaction1 = new Transaction(123, "Poltava", 45, "nnn", TransactionType.INCOME, new Date());
        Transaction transaction2 = new Transaction(123, "Poltava", 45, "nnn", TransactionType.INCOME, new Date());
        Controller controller = new Controller();

        try {
            System.out.println(controller.save(transaction0).getId());
            System.out.println(Arrays.toString(controller.transactionList()));
            System.out.println(Arrays.toString(controller.transactionList("Poltava")));
            System.out.println(Arrays.toString(controller.transactionList(12)));

        } catch (BadRequestException e) {
            System.out.println(e.getMessage());
        } catch (InternalServerException e) {
            System.out.println(e.getMessage());
        }

    }
}
