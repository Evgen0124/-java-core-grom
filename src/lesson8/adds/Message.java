package lesson8.adds;

import java.util.Date;

/**
 * Created by user on 04.07.2017.
 */
public class Message extends BaseEntity {
    User userFrom;
    User userTo;
    Date dateSent;
    Date dateRead;
    String message;

    public Message(long id, User userFrom, User userTo, Date dateSent, String message) {
        super(id);
        this.userFrom = userFrom;
        this.userTo = userTo;
        this.dateSent = new Date();
        this.message = message;
    }
    void  setDateRead(){
        dateRead = new Date();

    }
    boolean isRead(){
        return dateRead == null;
    }
}

