// Complete - Java II - OOP Circle Exercise
package shapes;

import util.Input;

import java.util.Scanner;


public class CircleApp {
    public static void main(String[] args) {
        Input input = new Input();
        boolean confirm;
        int circleCount = 1;
        do {
            double radius = input.getDouble("Enter a radius:");
            Circle circle = new Circle(radius);
            System.out.println(circle.getCircumference());
            System.out.println(circle.getArea());
            System.out.println("Circle count: " + circleCount);
            circleCount ++;
        } while (input.yesNo("Continue? [ y , n ]"));
    }
}
