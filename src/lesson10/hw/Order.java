package lesson10.hw;

import java.util.Date;

/**
 * Created by user on 18.07.2017.
 */
public abstract class Order {
  private   String itemName;
   private Date dateCreated;
   private Date dateConfirmed;
   private Date dateShipped;
   private String shipToCity;
   private int basePrice;
   private double totalPrice;
   private Customer customerOwner;

    public Order(Date dateConfirmed, Date dateShipped, double totalPrice) {
        this.dateConfirmed = dateConfirmed;
        this.dateShipped = dateShipped;
        this.totalPrice = totalPrice;
    }
    abstract void validateOrder();
    abstract  void  calculatePrice();
    void  confirmShipping(){
        dateShipped = new Date();
    }

    public String getItemName() {
        return itemName;
    }

    public Date getDateCreated() {
        return dateCreated;
    }

    public String getShipToCity() {
        return shipToCity;
    }

    public int getBasePrice() {
        return basePrice;
    }

    public Customer getCustomerOwner() {
        return customerOwner;
    }

    public Date getDateConfirmed() {
        return dateConfirmed;
    }

    public void setDateConfirmed(Date dateConfirmed) {
        this.dateConfirmed = dateConfirmed;
    }

    public Date getDateShipped() {
        return dateShipped;
    }

    public void setDateShipped(Date dateShipped) {
        this.dateShipped = dateShipped;
    }

    public double getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(double totalPrice) {
        this.totalPrice = totalPrice;
    }
}
