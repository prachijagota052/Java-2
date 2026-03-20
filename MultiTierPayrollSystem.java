class Employee{
    String name;
    double baseSalary;
    double totalSalary;
    Employee(String name, double baseSalary){
        this.name=name;
        this.baseSalary=baseSalary;
        totalSalary=calculateSalary();
        System.out.println("Salary for "+name+": "+String.format("%.2f", totalSalary));
    }
    double calculateSalary(){
        return baseSalary+(baseSalary*0.05);
    }
}

class Manager extends Employee{
    double managerSalary;
    Manager(String name, double baseSalary){
        super(name, baseSalary);
    }
    @Override
    double calculateSalary() {
        managerSalary=super.calculateSalary()+2000;
        return managerSalary;
    }
}

class Executive extends Manager{
    Executive(String name, double baseSalary){
        super(name, baseSalary);
    }
    @Override
    double calculateSalary() {
        return super.calculateSalary()+(super.baseSalary*0.1);
    }
}

public class MultiTierPayrollSystem {
    public static void main(String[] args) {
        Employee employee=new Employee("John", 10000);
        Employee manager=new Manager("Alice", 10000);
        Employee executive=new Executive("Bob", 10000);
    }
}