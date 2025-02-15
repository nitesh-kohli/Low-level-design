package Dependency_inversion_principle;

public class CreditCardPayment implements PaymentProcessor {
    public void pay(int amount) {
        System.out.println("💳 Paid " + amount + " using Credit Card.");
    }
}
