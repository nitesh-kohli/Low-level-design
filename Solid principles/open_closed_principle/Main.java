package open_closed_principle;

//open/closed principle
//Software entities (classes, modules, functions) should be open for extension but closed for modification.
//Benefits of Following OCP
//✅ No need to modify existing code when adding new shapes.
//✅ New shapes can be added independently by implementing the Shape interface.
//✅ Better maintainability and scalability.

//By following the Open-Closed Principle, our system becomes extensible and future-proof 🚀.
public class Main {
    public static void main(String[] args){
        Rectangle obj = new Rectangle(10,5);
        Circle crc = new Circle(23);

        System.out.println(obj.calculateArea());
        System.out.println(crc.calculateArea());
    }
}
