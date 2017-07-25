package lesson7;

import lesson6.Order;

import java.util.Date;

/**
 * Created by user on 17.06.2017.
 */
public class DemoHomeWork {

public Order createOrder(){
    Order order = new Order( );
    return  order;
}
    public Order createOrderAndCallMethods(){
        Order order1 = new Order(100, new Date( ), true, new Date( ), "Kiev", "Ukraine", "SomeValue");
       order1.isValidType();
        order1.checkPrice();
        order1.confirmOrder();
        return order1;
    }



    }
