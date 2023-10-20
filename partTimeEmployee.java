public class partTimeEmployee extends  Employee{
    private double hourlyRate;
    private double hoursWorked;

public partTimeEmployee(String name , int id , double hourlyRate , double hoursWorked){
super(name , id);
this.hourlyRate = hourlyRate;
this.hoursWorked=hoursWorked;
}

@Override
public double calculateSalary(){
    return hourlyRate*hoursWorked;
}

}
