//  Complete - Java II - Arrays Basics
package Arrays;

import Person.Person;

import java.util.Arrays;

public class ArraysExercises {
    public static void main(String[] args) {
//        int[] numbers = {1, 2, 3, 4, 5};
//        System.out.println(Arrays.toString(numbers));
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

    private static Person[] addPerson(Person[] peopleString, String name) {
        Person[] newPeopleString = Arrays.copyOf(peopleString, peopleString.length + 1);
        newPeopleString[peopleString.length] = new Person(name);
        peopleString = newPeopleString;
        return peopleString;
    }

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
