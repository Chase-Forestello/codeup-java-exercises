package Person;

// Complete - Java II - OOP Person.Person Exercise
public class Person {
    private String name;

    public static void main(String[] args) {
        Person person = new Person("Chase");
        System.out.println(person.getName());
        person.sayHello();
        person.setName("not Chase");
        person.sayHello();
        Person person5 = new Person("Someone");
        System.out.println(person5.getName());
        person5.sayHello();
        person5.setName("Someone else");
        person5.sayHello();
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
        System.out.println("Hello, " + name + "!");

    }
}
