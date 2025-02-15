package Interface_segregation_principle;

// ❌ Bad: This interface forces all restaurant staff to do everything
interface RestaurantStaff {
    void cook();
    void serve();
    void processPayment();
}

// 👨‍🍳 Chef only cooks but is forced to implement serve() and processPayment() ❌
class Chef implements RestaurantStaff {
    public void cook() {
        System.out.println("👨‍🍳 Chef is cooking delicious food!");
    }

    public void serve() {
        throw new UnsupportedOperationException("❌ Chef does not serve food!");
    }

    public void processPayment() {
        throw new UnsupportedOperationException("❌ Chef does not handle payments!");
    }
}

// 🍽️ Waiter only serves but is forced to implement cook() and processPayment() ❌
class Waiter implements RestaurantStaff {
    public void cook() {
        throw new UnsupportedOperationException("❌ Waiter does not cook!");
    }

    public void serve() {
        System.out.println("🍽️ Waiter is serving the food!");
    }

    public void processPayment() {
        throw new UnsupportedOperationException("❌ Waiter does not handle payments!");
    }
}

// 💰 Cashier only processes payments but is forced to implement cook() and serve() ❌
class Cashier implements RestaurantStaff {
    public void cook() {
        throw new UnsupportedOperationException("❌ Cashier does not cook!");
    }

    public void serve() {
        throw new UnsupportedOperationException("❌ Cashier does not serve food!");
    }

    public void processPayment() {
        System.out.println("💰 Cashier is processing the payment!");
    }
}




public class ISPViolation {
    public static void main(String[] args) {
        Chef chef = new Chef();
        chef.cook();
        chef.serve();
        chef.processPayment();
    }
}
