// Complete - Java II - Interfaces and Abstract Classes Exercise
// Complete - Java II - Inheritance and Polymorphism Exercises
package shapes;

public class Square extends Quadrilateral{
//    public Square(int length, int width) {
//        super(length, width);
//    }

    public Square(int side) {
        super(side, side);
        this.length = side;
        this.width = side;
    }

    @Override
    public double getPerimeter() {
        System.out.print("Square perimeter: ");
        return length * 4 ;
    }

    @Override
    public double getArea() {
        System.out.print("Square area: ");
        return length * 2;
    }

    @Override
    public void setLength(int side) {
        this.length = side;
    }

    @Override
    public void setWidth(int side) {
        this.width = side;

    }
//    protected int side;
//
//    public static void main(String[] args) {
//
//    }
//
//    public Square(int length, int width) {
//        super(length, width);
//    }
//
}