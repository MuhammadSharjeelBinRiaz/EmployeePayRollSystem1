import java.util.*;
public class PayRollSystem {
    private ArrayList <Employee> employeeList;

    public PayRollSystem(){
        employeeList = new ArrayList<>();
    }

    public void addEmployee(Employee employee){
        employeeList.add(employee);
    }
    public void removeEmployee(int id){
        Employee employeeToRemove = null;
        for(Employee employee : employeeList){
            if(employee.getId()== id){
                employeeToRemove = employee;
                System.out.println(employeeToRemove);
                break;
            }}
            if(employeeToRemove != null){
                employeeList.remove(employeeToRemove);
        }
    }
    public void displayEmployee(){
        for(Employee employee: employeeList){
        System.out.println(employee);
        }
    }

    public static void main(String[] args){
PayRollSystem payrollsystem = new PayRollSystem();
fullTimeEmployee emp1 = new fullTimeEmployee("Sharjeel", 1, 50000);
partTimeEmployee emp2 = new partTimeEmployee("Hamza", 62121, 250, 48);
    payrollsystem.addEmployee(emp1);
    payrollsystem.addEmployee(emp2);
    System.out.println("Initial Employee Details..!");
    payrollsystem.displayEmployee();
    System.out.println("Removing Employeee..!!");
    payrollsystem.removeEmployee(1);
    System.out.println("Remaining Employee");
    payrollsystem.displayEmployee();    
        




    }
}
