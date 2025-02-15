package Open_closed_principle;


class OCPViolation {
    public double calculateArea(Object shape) {
        if (shape instanceof Circle) {
            Circle circle = (Circle) shape;
            return Math.PI * circle.getRadius() * circle.getRadius();
        } else if (shape instanceof Rectangle) {
            Rectangle rectangle = (Rectangle) shape;
            return rectangle.getWidth() * rectangle.getHeight();
        }
        return 0;
    }
}

class Circle {
    private double radius;
    public Circle(double radius) { this.radius = radius; }

    public double getRadius() { return radius; }
    
    public char[] calculateArea() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'calculateArea'");
    }
}
class Rectangle {
    private double width, height;
    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }
    public double getWidth() { return width; }
    public double getHeight() { return height; }
}

