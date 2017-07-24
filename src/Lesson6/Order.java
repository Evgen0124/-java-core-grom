package Lesson6;

import java.util.Date;

/**
 * Created by user on 17.06.2017.
 */
public class Order {

    long id;
    int price;
    Date dateCreated;
    boolean isConfirmed;
    Date dateConfirmed;
    String city;
    String country;
    String type;


    public Order(int price, Date dateCreated, boolean isConfirmed, Date dateConfirmed, String city, String country, String type) {
        this.price = price;
        this.dateCreated = dateCreated;
        this.isConfirmed = isConfirmed;
        this.dateConfirmed = dateConfirmed;
        this.city = city;
        this.country = country;
        this.type = type;
    }

    public Order() {
    }
    Order order = new Order(100, new Date( ), false, null, "Dnepr", "Ukraine", "Buy" );
    public void confirmOrder() {
        if (!isConfirmed) {
            isConfirmed = true;
            dateConfirmed = new Date();
        }
    }

    public boolean checkPrice() {
        if(price > 1000)
            return  true;
        return  false;

    }
    public boolean isValidType(){
        if (type == "Buy"|| type == "Sale")
            return  true;
        return  false;


    }
}
