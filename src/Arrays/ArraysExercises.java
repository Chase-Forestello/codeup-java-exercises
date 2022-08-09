//  Incomplete - Java II - Arrays
package Arrays;

import Person.Person;

import java.util.Arrays;

public class ArraysExercises {
    public static void main(String[] args) {
//        int[] numbers = {1, 2, 3, 4, 5};
//        System.out.println(Arrays.toString(numbers));
        Person[] myPeople = {new Person("Chase"), new Person("Sam"), new Person("Chris")};
        for (Person myPerson : myPeople) {
            System.out.print(myPerson.getName() + " ");
        }
    }
}
