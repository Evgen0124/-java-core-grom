package lesson8.Phone;

/**
 * Created by user on 03.07.2017.
 */
    public class Demo {
    public static void main(String[] args) {
        IPhone IPhone = new IPhone(110, 10.0, "China", true);
        IPhone.deleteIPhoneFromDb();
        IPhone.orderPhone();
    }
    }

