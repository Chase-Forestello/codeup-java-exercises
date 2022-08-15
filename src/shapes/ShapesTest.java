// Complete - Java II - Interfaces and Abstract Classes Exercise
// Complete - Java II - Inheritance and Polymorphism Exercises
package shapes;

public class ShapesTest {
    public static void main(String[] args) {
//        Rectangle box1 = new Rectangle(4,5);
//        System.out.println(box1.Perimeter());
//        System.out.println(box1.area());
//        Rectangle box2 = new Square(2);
//        System.out.println(box2.perimeter());
//        System.out.println(box2.area());

//        Measurable myShape = new Measurable() {
//            @Override
//            public double getPerimeter() {
//                return 0;
//            }
//
//            @Override
//            public double getArea() {
//                return 0;
//            }
//        };

//        Test your code by creating instances of both Square and Rectangle
//        and assigning them to myShape, so you can display the shape's area
//        and perimeter.
//        Square square = new Square(2);
//        System.out.println(square.getArea());
//        System.out.println(square.getPerimeter());
//        Rectangle rectangle = new Rectangle(8, 8);
//        System.out.println(rectangle.getArea());
//        System.out.println(rectangle.getPerimeter());

        System.out.println("--------------------");


        // Squares return 0
        Measurable myShape = new Square(2);
        System.out.println(myShape.getArea());
        System.out.println(myShape.getPerimeter());
        myShape = new Rectangle(8, 8);
        System.out.println(myShape.getArea());
        System.out.println(myShape.getPerimeter());
        // Below will not work because Measurable does not have a
        // get length method. It would need to be overridden
        // for both square and rectangle.
        // System.out.println(myShape1.getLength());
    }
}