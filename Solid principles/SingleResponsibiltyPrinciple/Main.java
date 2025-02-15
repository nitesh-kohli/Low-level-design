package SingleResponsibiltyPrinciple;

public class Main {
    public static void main(String[] args) {
        Employee obj = new Employee("Nitesh", 118444.45);
        System.out.print("name is : ");
        ReportCreator.createReport(obj);
        System.out.printf("Salary is : ");
        SalaryCalculator.calculateSalary(obj); 
    }
}
