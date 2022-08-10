// Incomplete - Java II - Inheritance and Polymorphism Exercises
package poly;

public class Bird {
    private int flySpeed;

    public Bird(int flySpeed) {
        this.flySpeed = flySpeed;
    }


    public int getFlySpeed() {
        return flySpeed;
    }

    public void fly() {
        System.out.println("Avian is flying at " + flySpeed + " speed.");
    }
    public void eat() {
        System.out.println("Avian eats some bread.");
    }
}
