package lesson8.Phone;

/**
 * Created by user on 03.07.2017.
 */
public class IPhone extends Phone {

    boolean fingerPrint;

    public IPhone(int price, double weight, String countryProduced, boolean fingerPrint) {
        super(price, weight, countryProduced);
        System.out.println("IPhone constructor was invoked...");
        this.fingerPrint = fingerPrint;
    }

    void deleteIPhoneFromDb(){
        System.out.println("deleteIPhoneFromDb invoked...");
    }
}
