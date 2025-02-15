package Liskov_substitution_principle;

public class Main {
    public static void main(String[] args) {
        Car car = new Car();
        Airplane plane = new Airplane();

        car.moveForward();
        plane.turnLeft();
    }
}
