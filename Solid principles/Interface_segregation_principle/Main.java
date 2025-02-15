package Interface_segregation_principle;

//A class should not be forced to implement interfaces it does not use.
//This means that large interfaces should be split into smaller, more specific ones to avoid unnecessary dependencies.

public class Main {
    public static void main(String[] args) {
        Chef chef = new Chef();
        chef.cook();
        Waiter waiter = new Waiter();
        waiter.serve();
    }
}
