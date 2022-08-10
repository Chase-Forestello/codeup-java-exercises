// Incomplete - Java II - Inheritance and Polymorphism Exercises
package poly;

public class PolyMain {
    public static void main(String[] args) {

        Bird parrot = new Bird(2);
        parrot.fly();
        parrot.eat();

        Duck duck = new Duck(5, 8);
        duck.swim();
        duck.fly();
        duck.quack();
        duck.eat();

        RubberDuck codey = new RubberDuck();
        codey.quack();
        codey.fly();
        codey.eat();
    }
}
