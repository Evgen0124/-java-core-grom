package Lesson8.adds;

import java.util.Date;

/**
 * Created by user on 04.07.2017.
 */
public class HouseAd extends  Ad {
    String ownerName;
    String address;
    double square;
    int floors;

    public HouseAd(int price, long id, Date dateCreated, String ownerName, String address, double square, int floors) {
        super(price, id, dateCreated);
        this.ownerName = ownerName;
        this.address = address;
        this.square = square;
        this.floors = floors;
    }

}
     boolean checkOwner(){
Owner owners = new Owner();
         for (String owner : owners.owners){
             if (ownerName == owner)
                 return  true;
     }
     return  false;
}
