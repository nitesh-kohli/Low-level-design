package Open_closed_principle;

public class Rectangle implements Shape {
    private double width,height;

    public Rectangle(double width,double height){
        this.width = width;
        this.height = height;
    }

    public double calculateArea(){
        return width*height;
    }
}
