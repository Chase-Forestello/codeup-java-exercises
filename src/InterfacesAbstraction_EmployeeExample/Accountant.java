// Java II - Interfaces & Abstraction - Employee Example
package InterfacesAbstraction_EmployeeExample;

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
