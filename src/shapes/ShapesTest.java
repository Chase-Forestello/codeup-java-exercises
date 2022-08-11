// Complete - Java II - Inheritance and Polymorphism Exercises
package shapes;

public class ShapesTest {
    public static void main(String[] args) {
        Rectangle box1 = new Rectangle(4,5);
        System.out.println(box1.perimeter());
        System.out.println(box1.area());
        Rectangle box2 = new Square(2);
        System.out.println(box2.perimeter());
        System.out.println(box2.area());
    }
}
