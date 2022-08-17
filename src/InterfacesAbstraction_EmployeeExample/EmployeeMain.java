// Java II - Interfaces & Abstraction - Employee Example
package InterfacesAbstraction_EmployeeExample;

public class EmployeeMain {
    public static void main(String[] args) {

        Employee genericWorker = new Accountant("bob", "accounting");
        System.out.println(genericWorker.work());
        System.out.println(genericWorker.eatLunch());
        genericWorker.liftHeavyObject("ship");

        Employee genericWorker1 = new Accountant("Sam", "accounting");
        System.out.println(genericWorker1.work());
        System.out.println(genericWorker1.eatLunch());
        genericWorker1.setName("Tim");
        System.out.println(genericWorker1.work() + "\n" + genericWorker1.eatLunch());

        Employee genericWorker2 = new Manager("John", "Management");
        System.out.println(genericWorker2.work());
        System.out.println(genericWorker2.eatLunch());

        Manager bossMan = new Manager("Rick", "DoNoting");
        bossMan.liftHeavyObject("stick");
        bossMan.liftHeavyObject("car");
        bossMan.LiftHeavyObject("house");

        Employee [] peons = new Employee[3];
        peons[0] = new Accountant("Jane", "Accounting");
        peons[1] = new Manager("Tim","Management");
        peons[2] = new Accountant("Sally", "Accounting");

        for (Employee peon : peons) {
            System.out.print("Is " + peon.getName() + " an accountant? " + "[" + (peon instanceof Accountant) + "]" + " ");
            System.out.print("Is " + peon.getName() + " a Manager? " + "[" + (peon instanceof Manager) + "]" + " ");
            System.out.print("Is " + peon.getName() + " a heavy lifter? " + "[" + (peon instanceof HeavyLifter) + "]" + " \n");

        }

    }

}
