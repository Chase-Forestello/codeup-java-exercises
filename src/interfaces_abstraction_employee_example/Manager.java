// Complete - Java II - Interfaces & Abstraction - Employee Example
package interfaces_abstraction_employee_example;

public class Manager extends Employee implements HeavyLifter {
    public Manager(String name, String department) {
        super(name, department);
    }

    @Override
    public String work() {
        return name + " managers things.";
    }

    @Override
    public String eatLunch() {
        return name + " eats nothing for lunch.";
    }

    @Override
    public void LiftHeavyObject(String heavyObject) {
        System.out.println(name + " lifts " + heavyObject);
    }
}
