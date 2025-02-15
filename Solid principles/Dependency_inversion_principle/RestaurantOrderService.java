package Dependency_inversion_principle;

// ✅ RestaurantOrderService now depends on an abstraction (interface)
public class RestaurantOrderService {
    private PaymentProcessor paymentProcessor; // depend on interface

    // ✅ Inject dependency via constructor
    public RestaurantOrderService(PaymentProcessor paymentProcessor){
        this.paymentProcessor = paymentProcessor;
    }

    public void checkout(int amount){
        paymentProcessor.pay(amount);
    }

}
