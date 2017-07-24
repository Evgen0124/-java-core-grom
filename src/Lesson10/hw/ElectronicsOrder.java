package Lesson10.hw;

import java.util.Date;

/**
 * Created by user on 18.07.2017.
 */
public abstract class ElectronicsOrder extends Order {
    private  int guarantMonth;

    public ElectronicsOrder(Date dateConfirmed, Date dateShipped, double totalPrice, int guarantMonth) {
        super(dateConfirmed, dateShipped, totalPrice);
        this.guarantMonth = guarantMonth;
    }

    @Override
    void validateOrder() {
        String[] cityFrom =  {"Киев","Одесса","Днепр","Харьков"};
    }
}


