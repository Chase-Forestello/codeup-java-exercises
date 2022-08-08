// Incomplete - Java II - OOP Exercise
public class Person {
    private String name;

    public static void main(String[] args) {
        Person person = new Person("Chase");
//        System.out.println(person.name);
        System.out.println(person.getName());
        person.setName("notChase");
        person.sayHello();
    }

    public Person(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void sayHello() {
        System.out.println("Hello, " + this.name + "!");

    }
}
