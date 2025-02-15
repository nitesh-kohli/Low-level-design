package Dependency_inversion_principle;

public class Main {
    public static void main(String[] args) {
        PaymentProcessor creditCard = new CreditCardPayment();
        PaymentProcessor upi = new UpiPayment();

        // ✅ We can now choose different payment methods without modifying RestaurantOrderService
        RestaurantOrderService order1 = new RestaurantOrderService(creditCard);
        order1.checkout(700);
        RestaurantOrderService order2 = new RestaurantOrderService(upi);
        order2.checkout(1000);
    }
}
