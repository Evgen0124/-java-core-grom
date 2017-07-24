package Lesson10.abstractbigexample;

/**
 * Created by user on 18.07.2017.
 */
public class ManagerEmployee extends  Employee {
    public ManagerEmployee(String name, int age, int yearsOfExperience, String curPosition, int salaryPerMoth) {
        super(name, age, yearsOfExperience, curPosition, salaryPerMoth);
    }

    @Override
    void paySalary() {
        int newBalance = getBankAccount().getBalance() + getSalaryPerMoth();
        newBalance += newBalance * 0.25;

    }
}
