package Liskov_substitution_principle;

public class Car implements RemoteControl {
    public void moveForward(){
        System.out.println("🚗car is moving forward...");
    }

    public void turnLeft(){
        System.out.println("🚗car is turning left...");
    }
}
