// Complete - Java II - OOP Input Exercise
package util;

import java.util.Scanner;

public class Input {
    private final Scanner scanner = new Scanner(System.in);


    public static void main(String[] args) {
        Input input = new Input();
        System.out.println(input.getString("Enter a word:"));
        System.out.println(input.yesNo("Enter 'yes' or 'y':"));
        System.out.println(input.getInt(1, 10, "Enter an integer 1-10:"));
        System.out.println(input.getInt("Enter an integer:"));
        System.out.println(input.getDouble(1, 10, "Enter a double 1-10:"));
        System.out.println(input.getDouble("Enter a double:"));
    }


    // Returns next string
    public String getString(String prompt) {
        System.out.print(prompt);
        return scanner.nextLine();
    }


    // Returns true if the user input = "yes" or "y" else returns false.
    public boolean yesNo(String prompt) {
        System.out.println(prompt);
        String userInput = scanner.nextLine();
        return userInput.equalsIgnoreCase("y") || userInput.equalsIgnoreCase("yes");
    }


    // Returns int or continue prompting the user until they are within range (1-10).
    public int getInt(int min, int max, String prompt) {
        System.out.print(prompt);
        boolean intRange;
        int result;
        do {
            int userInt = scanner.nextInt();
            result = userInt;
            if (userInt > max || userInt < min) {
                System.out.print("Enter int within 1-10 range: ");
            } else {
                System.out.print("Your int is: ");
            }
            intRange = (userInt > max || userInt < min);
        } while (intRange);
        return result;
    }

    // Returns next int
    public int getInt(String prompt) {
        System.out.print(prompt);
//        System.out.print("Enter a radius: ");
        return scanner.nextInt();
    }

    // Returns double or continue prompting the user until they are within range (1-10).
    public double getDouble(double min, double max, String prompt) {
        System.out.print(prompt);
        boolean DoubleRange;
        double result;
        do {
            double userDouble = scanner.nextDouble();
            result = userDouble;
            if (userDouble > max || userDouble < min) {
                System.out.print(prompt);
            } else {
                System.out.print("Your double is: ");
            }
            DoubleRange = (userDouble > max || userDouble < min);
        } while (DoubleRange);
        return result;
    }

    // Returns next double
    public double getDouble(String prompt) {
        System.out.print(prompt);
        double userInput = scanner.nextDouble();
        // Clearing buffer from scanner
        scanner.nextLine();
        return userInput;
    }
}


