package Interface_segregation_principle;

public class Waiter implements Server {
    public void serve() {
        System.out.println("🍽️ Waiter is serving the food!");
    }
}
