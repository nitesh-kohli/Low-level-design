package Dependency_inversion_principle;

public class UpiPayment implements PaymentProcessor {
    public void pay(int amount) {
        System.out.println("🅿️ Paid " + amount + " using UPI.");
    }
}
