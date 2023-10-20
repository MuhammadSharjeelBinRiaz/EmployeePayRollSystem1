public class fullTimeEmployee extends Employee{
private double monthlySalary;
    public fullTimeEmployee(String name , int id , double Salary){
    super (name,id);
    this.monthlySalary=Salary;
    
}
@Override
    public double calculateSalary(){
        return monthlySalary;
    }
}
