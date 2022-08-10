// Incomplete - Java II - Inheritance and Polymorphism Exercises
package poly;

public class Duck extends Bird {

    private int swimSpeed;

    public Duck(int flySpeed, int swimSpeed) {
        super(flySpeed);
        this.swimSpeed = swimSpeed;
    }

    public void swim() {
        System.out.println("The duck swims at " + swimSpeed + " swims.");
    }

    public void quack() {
        System.out.println("The duck quacks!");
    }
}
