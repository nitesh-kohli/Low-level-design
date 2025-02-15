package Liskov_substitution_principle;

public class Airplane implements RemoteControl{
    public void moveForward(){
        System.out.println("🛩️airplane is moving forward in air...");
    }
    public void turnLeft(){
        System.out.println("🛩️airplane turned left in air...");
    }
}