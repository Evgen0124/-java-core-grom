package Lesson10.abstractbigexample;

/**
 * Created by user on 17.07.2017.
 */
public class DeveloperEmployee extends  Employee {
   private String[] frameworks = new String[10];

    public DeveloperEmployee(String name, int age, int yearsOfExperience, String curPosition, int salaryPerMoth, String[] frameworks) {
        super(name, age, yearsOfExperience, curPosition, salaryPerMoth);
        this.frameworks = frameworks;
    }

    @Override
    void paySalary() {
        int newBalance = getBankAccount().getBalance() + getSalaryPerMoth() + 1000;
        getBankAccount().setBalance(newBalance);

    }
}
