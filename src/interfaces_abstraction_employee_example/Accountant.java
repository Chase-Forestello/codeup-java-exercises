// Complete - Java II - Interfaces & Abstraction - Employee Example
package interfaces_abstraction_employee_example;

public class Accountant extends Employee{
    public Accountant(String name, String department) {
        super(name, department);
    }

    @Override
    public String eatLunch() {
        return name + " eats food for lunch.";
    }

    @Override
    public String work() {
        return name + " accounts things.";
    }
}
