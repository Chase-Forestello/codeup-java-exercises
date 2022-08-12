// Incomplete - Java II - Interfaces and Abstract Classes Exercise
// Complete - Java II - Inheritance and Polymorphism Exercises
package shapes;

public class Rectangle extends Quadrilateral implements Measurable {
    public Rectangle(int length, int width) {
        super(length, width);
    }

    @Override
    public double getPerimeter() {
        System.out.print("Rectangle perimeter: ");
        return length * 2 + width * 2;
    }

    @Override
    public double getArea() {
        System.out.print("Rectangle area: ");
        return length * width;
    }

    @Override
    public void setLength(int length) {
        this.length = length;

    }

    @Override
    public void setWidth(int width) {
        this.width = width;
    }
//    protected int length;
//    protected int width;
//
//    public static void main(String[] args) {
//
//    }
//
//    public Rectangle(int length, int width) {
//        this.length = length;
//        this.width = width;
//    }
//
//    public int getLength() {
//        return length;
//    }
//
//    public void setLength(int length) {
//        this.length = length;
//    }
//
//    public int getWidth() {
//        return width;
//    }
//
//    public void setWidth(int width) {
//        this.width = width;
//    }
//
//    public int perimeter() {
//        return length * 2 + width * 2;
//    }
//
//    public int area() {
//        return length * width;
//    }

}
