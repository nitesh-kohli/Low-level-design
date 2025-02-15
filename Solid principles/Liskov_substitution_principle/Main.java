package Liskov_substitution_principle;

/*
 "Objects of a derived class should be able to replace objects of the base class without affecting the correctness of the program."
This means that a subclass should extend the behavior of a parent class without changing its expected behavior.
 */
public class Main {
    public static void main(String[] args) {
        Car car = new Car();
        Airplane plane = new Airplane();

        car.moveForward();
        plane.turnLeft();
    }
}
