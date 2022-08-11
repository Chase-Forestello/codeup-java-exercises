// Complete - Java I - Console IO Exercises
package ConsoleExercises;
import java.util.Scanner;

public class ConsoleExercises {
    public static void main(String[] args) {
        double pi = 3.14159;
        System.out.format("The value of pi is approximately" + " %.2f%n", pi);

        Scanner s = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int userInput = s.nextInt();

        s.nextLine();

        System.out.print("Enter 3 words: ");
        String userInput1 = s.next();
        String userInput2 = s.next();
        String userInput3 = s.next();
        System.out.printf("%s%n%s%n%s%n", userInput1, userInput2, userInput3);

        s.nextLine();

        System.out.print("Enter a sentence:");
        String userSentence = s.nextLine();
        System.out.printf("%s", userSentence);

//        s.nextLine();
//        System.out.print("Enter a length:");
//        String userLength = s.nextLine();
//        System.out.println("Length: " + userLength + " ft");
//        System.out.print("Enter a width:");
//        String userWidth = s.nextLine();
//        System.out.println("Width: " + userWidth + " ft");
//        int userLengthParsed = parseInt(userLength, 16);
//        int userWidthParsed = parseInt(userWidth);
//        int area = userLengthParsed * userWidthParsed;
//        int perimeter = (userLengthParsed * 2) + (userWidthParsed * 2);
//        System.out.printf("Area: %s sqft%nPerimeter: %s ft%n", area, perimeter);

        s.nextLine();
//        s.useDelimiter("/n");
        System.out.print("Enter a length, width, and height:");
        float userLength = s.nextFloat();
        float userWidth = s.nextFloat();
        float userHeight = s.nextFloat();
        float area = userLength * userWidth;
        float perimeter = (userLength * 2) + (userWidth * 2);
        float volume = userLength * userHeight * userWidth;
        System.out.printf("Area: %s ft\u00B2%nPerimeter: %s ft%nVolume: %s ft\u00B3%n ", area, perimeter, volume);
        s.close();
    }
}