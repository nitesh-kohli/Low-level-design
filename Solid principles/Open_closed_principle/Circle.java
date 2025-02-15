package Open_closed_principle;

public class Circle implements Shape{
    private double radius;

    public Circle(double radius){
        this.radius = radius;
    }

    public double calculateArea(){
        return Math.PI*radius*radius;
    }
};
