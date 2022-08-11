// Complete - Java II - Arrays Basics
package Arrays;

import Person.Person;

import java.util.Arrays;

public class ArraysExercises {
    public static void main(String[] args) {

        // Creating a new person array called my people with 3 Person objects inside
        Person[] myPeople = {new Person("Chase"), new Person("Sam"), new Person("Chris")};
        printNames(myPeople);

        System.out.println();

        myPeople = addPerson(myPeople, "Matthew");
        myPeople = addPerson(myPeople, "John");
        myPeople = addPerson(myPeople, "Ryan");
        myPeople = addPerson(myPeople, "Steve");

        printNames(myPeople);

        System.out.println();

        System.out.println(Arrays.toString(myPeople));
    }

    // Method to add a new person to the array and override the old array
    private static Person[] addPerson(Person[] peopleString, String name) {
        Person[] newPeopleString = Arrays.copyOf(peopleString, peopleString.length + 1);
        newPeopleString[peopleString.length] = new Person(name);
        peopleString = newPeopleString;
        return peopleString;
    }

    // Method to print names from Person arrays ONLY
    private static void printNames(Person[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i].getName());
            if (i < array.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println();
    }
}