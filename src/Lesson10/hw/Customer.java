package Lesson10.hw;

/**
 * Created by user on 18.07.2017.
 */
public class Customer {
    String name;
    String city;
    String gender;

    public Customer(String name, String city, String gender) {
        this.name = name;
        this.city = city;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public String getCity() {
        return city;
    }

    public String getGender() {
        return gender;
    }
}