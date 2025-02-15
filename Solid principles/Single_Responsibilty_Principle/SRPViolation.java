package Single_Responsibilty_Principle;

@SuppressWarnings("unused")
class SRPViolation {
    private String name;
    private double salary;

    public SRPViolation(String name, double salary) {
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
