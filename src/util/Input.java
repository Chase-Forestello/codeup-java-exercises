// Incomplete - Java II - OOP Input Exercise
package util;
import java.util.Scanner;

public class Input {
    private Scanner scanner = new Scanner(System.in);


    public static void main(String[] args) {
        Input input = new Input();
        System.out.println("Enter a word:");
        System.out.println(input.getString());
        System.out.println(input.yesNo());
        System.out.println(input.getInt(1, 10));
    }


    // Returns the user input if it is a string
    public String getString() {
        return scanner.nextLine();
    }


    // Returns true if the user input = "yes" or "y" else returns false.
    public boolean yesNo() {
        System.out.print("Enter 'yes' or 'y':");
        String userInput = getString();
        boolean passed;
        passed = userInput.equalsIgnoreCase("y") || userInput.equalsIgnoreCase("yes");
        return passed;
    }


    // Return success or continue prompting the user until they are within range (1-10).
    public String getInt(int min, int max) {
        System.out.print("Enter a number 1-10:");
        boolean userInput = scanner.hasNextInt();
            int userIntInput;
        if (userInput) {
            userIntInput = scanner.nextInt();
            if (min < userIntInput && userIntInput < max) {
                System.out.println("Good job!");
            } else {
                System.out.println("Try again!");
                getInt(1,10);
            }
        } else {
            System.out.print("Try again:");
            Input input = new Input();
            input.getInt(1, 10);
        }
        return "Input is in range!";
    }
}

