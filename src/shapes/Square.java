// Complete - Java II - Inheritance and Polymorphism Exercises
package shapes;

public class Square extends Rectangle {
    protected int side;

    public static void main(String[] args) {

    }

    public Square(int length, int width) {
        super(length, width);
    }

    public Square(int side) {
        super(side, side);
        this.side = side;
    }
}