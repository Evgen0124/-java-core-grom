package Lesson9;

/**
 * Created by user on 06.07.2017.
 */
public class Company {
  private   String name;
  private   String countryFounded;

    protected  String code;
    public  int someField;

    public Company(String name, String countryFounded) {
        this.name = name;
        this.countryFounded = countryFounded;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCountryFounded() {
        return countryFounded;
    }

    public void setCountryFounded(String countryFounded) {
        this.countryFounded = countryFounded;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public int getSomeField() {
        return someField;
    }

    public void setSomeFiled(int someField) {
        this.someField = someField;
    }
}
