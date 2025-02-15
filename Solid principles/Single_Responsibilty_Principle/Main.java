package Single_Responsibilty_Principle;

//Single responsibilty principle
//a class should have only one reason to change
//By following SRP, each class has a well-defined purpose, making the codebase cleaner and more scalable. 🚀

public class Main {
    public static void main(String[] args) {
        Employee obj = new Employee("Nitesh", 118444.45);
        System.out.print("name is : ");
        ReportCreator.createReport(obj);
        System.out.printf("Salary is : ");
        SalaryCalculator.calculateSalary(obj); 
    }
}
