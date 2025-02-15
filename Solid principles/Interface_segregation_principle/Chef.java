package Interface_segregation_principle;

public class Chef implements Cook {
    public void cook(){
        System.out.println("👨‍🍳 Chef is cooking delicious food!");
    }
}
