package lesson10.abstractbigexample;

/**
 * Created by user on 16.07.2017.
 */
public class BankAccount {
    private Employee employee;
    private int balance;

    public BankAccount(Employee employee, int balance) {
        this.employee = employee;
        this.balance = balance;
    }

    public Employee getEmployee() {
        return employee;
    }

    public int getBalance() {
        return balance;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }
}
