// Complete - Java I - Java Intro - Hello World Exercise
import java.util.Scanner;

import static java.lang.Integer.parseInt;

public class HelloWorld {
    public static void main(String[] args) {
        // Hello World with and without new line
        System.out.println("Hello, World!");
        System.out.print("Hello, ");
        System.out.print("World!\n");

        int myFavoriteNumber = 58;
        System.out.println(myFavoriteNumber);

        String myString = "Whataburger";
        System.out.println(myString);

        double myNumber = 3.14;
        System.out.println(myNumber);

        int x = 4;
        x = x + 5;
        /* shorthand */ x += 5;
        System.out.println(x);

        int x2 = 3;
        int y = 4;
        /* shorthand */ y *= x2;
        System.out.println(y);

        int x3 = 10;
        int y2 = 2;
        /* shorthand */ x3 /= y2;
        System.out.println(x3);
        /* shorthand */ y2 -= x3;
        System.out.println(y2);
    }
}


