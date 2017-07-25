package lesson10.abstractbigexample;

/**
 * Created by user on 16.07.2017.
 */
public abstract class Employee {

    private  String name;
    private  int age;
    private  int yearsOfExperience;
    private  String curPosition;
    private int salaryPerMoth;
    private  BankAccount bankAccount;
    private  Company[] companiesWorked = new Company[10];
    private  String[] positionsWorked = new String[10];

    public Employee(String name, int age, int yearsOfExperience, String curPosition, int salaryPerMoth) {
        this.name = name;
        this.age = age;
        this.yearsOfExperience = yearsOfExperience;
        this.curPosition = curPosition;
        this.salaryPerMoth = salaryPerMoth;
    }

    abstract void paySalary();



    void changePosition(String newPosition){
        saveCurPositionToHistory();
        curPosition = newPosition;

    }
    private void  saveCurPositionToHistory() {
        int index = 0;
        for (String pos : positionsWorked) {
            if (pos == null) {
                positionsWorked[index] = curPosition;
                break;
            }
            index++;
        }
    }

        int getBalance (){
            return bankAccount.getBalance();
        }

    }

    public BankAccount getBankAccount() {
        return bankAccount;
    }

    public int getSalaryPerMoth() {
        return salaryPerMoth;
    }

    public String getName() {
        return name;
    }
}
