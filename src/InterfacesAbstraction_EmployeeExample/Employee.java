// Java II - Interfaces & Abstraction - Employee Example
package InterfacesAbstraction_EmployeeExample;

public abstract class Employee {

    protected String department;
    protected String name;

    public Employee(String name, String department) {
        this.name = name;
        this.department = department;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public abstract String work();

    public abstract String eatLunch();

    public void liftHeavyObject(String heavyObject) {
        System.out.println(name + " lifts " + heavyObject);
    }

}
