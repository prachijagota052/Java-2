import java.util.ArrayList;
class Employee{
    String name;
    String EmployeeID;
    String role;
    double baseSalary;
    Employee(String name, String EmployeeID, String role, double baseSalary){
        this.name=name;
        this.EmployeeID=EmployeeID;
        this.role=role;
        this.baseSalary=baseSalary;
    }
    double finalSalary=0;
    public double calculateSalary()
    {
        finalSalary=baseSalary;
        switch(this.role)
        {
            case "Manager":
                finalSalary+=baseSalary*0.2;
                break;
            case "Developer":
                finalSalary+=baseSalary*0.1;
                break;
            case "Designer":
                finalSalary+=baseSalary*0.15;
                break;
            case "Intern":
                finalSalary+=baseSalary*0.05;
                break;
            default:
                System.out.println("Unknown role, no bonus applied.");
        }
        System.out.println("Calculated Salary for " + name + ": $" + finalSalary);
        return finalSalary;
    }
    public void ApplyDeduction(double amount)
    {
        finalSalary-=amount;

    }
    public void displayEmployeeDetails()
    {
        System.out.println("Name: " + name);
        System.out.println("Employee ID: " + EmployeeID);
        System.out.println("Role: " + role);
        System.out.println("Base Salary: $" + baseSalary);
        System.out.println("Salary with Bonus: $" + calculateSalary());
        System.out.println("Final Salary after Deductions: $" + finalSalary);
    }
}

class PayRoll extends Employee{
    PayRoll(String name, String EmployeeID, String role, double baseSalary) {
        super(name, EmployeeID, role, baseSalary);
    }
    private ArrayList<Employee> employees = new ArrayList<Employee>();
    public void addEmployee(Employee e){
        employees.add(e);
    }
    public void calculateAllSalaries()
    {
        for(Employee e: employees)
        { 
            e.calculateSalary();
        }
    }
    public Employee findEmployeeByID(String EmployeeID)
    {
        for(Employee e: employees)
        {
            if(e.EmployeeID.equals(EmployeeID))
            {
                System.out.println("Employee found: " + e.name); e.displayEmployeeDetails();
                return e;
            }
        }
        System.out.println("Employee not found");
        return null;
    }
}

public class Scenario_5{
    public static void main(String[] args) {
        PayRoll payroll = new PayRoll("Admin", "000", "Manager", 0);
        Employee e1 = new Employee("John Doe", "E001", "Manager", 5000);
        Employee e2 = new Employee("Jane Smith", "E002", "Developer", 4000);
        Employee e3 = new Employee("Emily Davis", "E003", "Designer", 3500);
        Employee e4 = new Employee("Michael Brown", "E004", "Intern", 2000);

        payroll.addEmployee(e1);
        payroll.addEmployee(e2);
        payroll.addEmployee(e3);
        payroll.addEmployee(e4);

        payroll.calculateAllSalaries();
        payroll.findEmployeeByID("E002");
    }
}