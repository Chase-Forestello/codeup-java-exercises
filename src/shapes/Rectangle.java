// Complete - Java II - Inheritance and Polymorphism Exercises
package shapes;

public class Rectangle {
    protected int length;
    protected int width;

    public static void main(String[] args) {

    }

    public Rectangle(int length, int width) {
        this.length = length;
        this.width = width;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int perimeter() {
        return length * 2 + width * 2;
    }

    public int area() {
        return length * width;
    }

}
