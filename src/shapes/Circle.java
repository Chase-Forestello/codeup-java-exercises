// Complete - Java II - OOP Circle Exercise
package shapes;

public class Circle {
    private static double radius;

    public Circle(double radius) {
        Circle.radius = radius;
    }


    public double getArea() {
        return Math.PI * Math.pow(radius,2);
    }

    public double getCircumference() {
        return 2 * Math.PI * radius;
    }

}

