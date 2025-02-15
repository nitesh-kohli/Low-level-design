package Liskov_substitution_principle;

class Car {
    void moveForward() {
        System.out.println("🚗 Car is moving forward!");
    }

    void turnLeft() {
        System.out.println("🚗 Car turned left!");
    }
}

// ❌ Wrong! Airplane should not be a Car!
class Airplane extends Car {
    @Override
    void turnLeft() {
        System.out.println("✈️ Airplane is flying UP instead of turning left! ❌");
    }
}


public class LSPViolation {
    public static void main(String[] args) {
        Car myCar = new Car();
        myCar.moveForward();  // 🚗 Car moves forward
        myCar.turnLeft();     // 🚗 Car turns left

        // Now we try using an airplane as a car
        Car myAirplane = new Airplane();
        myAirplane.moveForward();  // Works fine
        myAirplane.turnLeft();     // ❌ Airplane flies up! (Wrong behavior)
    }
}


