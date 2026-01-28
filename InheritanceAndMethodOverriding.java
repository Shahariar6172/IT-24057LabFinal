class Employee {
protected String name;
    public Employee(String name) {
        this.name = name;
    }
    public double calculateSalary() {
        System.out.println("Calculating salary for Employee...");
        return 0.0;
    }
}
class FullTimeEmployee extends Employee {
private double monthlySalary;
public FullTimeEmployee(String name, double monthlySalary) {
    super(name);
    this.monthlySalary = monthlySalary;
    }
    @Override
    public double calculateSalary() {
        System.out.println("Calculating salary for Full-Time Employee: " + name);
        return monthlySalary; 
    }
}
class PartTimeEmployee extends Employee {
    private double hourlyRate;
    private int hoursWorked;
    public PartTimeEmployee(String name, double hourlyRate, int hoursWorked) {
        super(name);
        this.hourlyRate = hourlyRate;
        this.hoursWorked = hoursWorked;
    }
    @Override
    public double calculateSalary() {
        System.out.println("Calculating salary for Part-Time Employee: " + name);
        return hourlyRate * hoursWorked; 
    }
}
public class InheritanceAndMethodOverriding {
public static void main(String[] args) {
        Employee e1 = new FullTimeEmployee("Alice", 5000.0);
        Employee e2 = new PartTimeEmployee("Bob", 20.0, 80);
        System.out.println(e1.name + "'s Salary: $" + e1.calculateSalary());
        System.out.println(e2.name + "'s Salary: $" + e2.calculateSalary());
    }
}
