package Single_Responsibilty_Principle;

public class example {
    
}

class Employee {
    private String name;
    private double salary;

    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    public void calculateSalary() {
        // Salary calculation logic
        System.out.println("Calculating salary for " + name);
    }

    public void generateReport() {
        // Report generation logic
        System.out.println("Generating report for " + name);
    }
}
