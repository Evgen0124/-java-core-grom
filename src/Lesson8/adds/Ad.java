package Lesson8.adds;

import java.util.Date;

/**
 * Created by user on 04.07.2017.
 */
public class Ad extends BaseEntity {
    int price;
    Date dateCreated;

    public Ad(int price, long id, Date dateCreated) {
        super(id);
        this.price = price;
        this.dateCreated = new Date();
    }
    void  publishAd(){

    }
}
