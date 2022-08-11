// Complete - Java II - Inheritance and Polymorphism Exercises
package shapes;

public class Square extends Quadrilateral{
    public Square(int length, int width) {
        super(length, width);
    }

    public Square(int side) {
        super(side, side);
        this.side = side;
    }

    @Override
    public double getPerimeter() {
        return side * 4 ;
    }

    @Override
    public double getArea() {
        return side * 2;
    }

    @Override
    public void setLength(int length) {
        this.side = length;
    }

    @Override
    public void setWidth(int width) {
        this.side = width;

    }
    protected int side;
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