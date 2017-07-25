package lesson10.abstractbigexample;

/**
 * Created by user on 18.07.2017.
 */
public class EmployeeController {
    private Employee[] employees = new Employee[100];

    void  paySalaryEmployees(){
        for (Employee employee: employees){
            employee.paySalary();
            System.out.println("Salary was paid successfuly to" + employee.getName() + "employee");
        }
    }
}
