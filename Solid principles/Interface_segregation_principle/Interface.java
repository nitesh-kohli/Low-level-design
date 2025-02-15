package Interface_segregation_principle;

public class Interface {
    
}

// ✅ Interface for people who cook
interface Cook {
    void cook();
}

// ✅ Interface for people who serve food
interface Server {
    void serve();
}

