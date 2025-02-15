package Dependency_inversion_principle;

// ❌ Direct dependency on CreditCardPayment (bad design)
class CreditCardPayment {
    public void pay(int amount) {
        System.out.println("💳 Paid " + amount + " using Credit Card.");
    }
}

// ❌ RestaurantOrderService is tightly coupled to CreditCardPayment
class RestaurantOrderService {
    private CreditCardPayment paymentProcessor; // ❌ Direct dependency

    public RestaurantOrderService() {
        this.paymentProcessor = new CreditCardPayment(); // ❌ Hardcoded dependency
    }

    public void checkout(int amount) {
        paymentProcessor.pay(amount);
    }
}

public class DIPViolation {
    public static void main(String[] args) {
        RestaurantOrderService orderService = new RestaurantOrderService();
        orderService.checkout(500);
    }
}
