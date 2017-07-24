package Lesson8.Phone;

/**
 * Created by user on 03.07.2017.
 */
public class Android extends Phone {

    String androidVersion;
    int screenSize;
    String secretDeviseCode;

    public Android(int price, double weight, String countryProduced, String androidVersion, int screenSize, String secretDeviseCode) {
       super(price, weight, countryProduced);
        this.androidVersion = androidVersion;
        this.screenSize = screenSize;
        this.secretDeviseCode = secretDeviseCode;
    }

    void  instalNewAndroidVesion(){

    }
}
