// Incomplete - Java II - Inheritance and Polymorphism Exercises
package poly;

public class RubberDuck extends Duck {

    public RubberDuck () {
        super(0, 0);
    }

    @Override
    public void eat() {
        System.out.println("No no.");
    }

    @Override
    public void quack() {
        System.out.println("squeak squeak");
    }

    @Override
    public void fly() {
        if (this.getFlySpeed() == 0){
            System.out.println("Try throwing the duck instead");
        } else {
            super.fly();
        }
    }
}
