import java.util.Scanner;

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
class ConsoleExercises {
    public static void main(String[] args) {
        double pi = 3.14159;
        System.out.format("The value of pi is approximately" + " %.2f%n", pi);

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int userInput = scanner.nextInt();

        Scanner threeWords = new Scanner(System.in);
        System.out.print("Enter 3 words: ");
        String userInput1 = threeWords.next();
        String userInput2 = threeWords.next();
        String userInput3 = threeWords.next();
        System.out.printf("%s%n%s%n%s%n", userInput1, userInput2, userInput3);

        Scanner sentence = new Scanner(System.in);
        System.out.print("Enter a sentence:");
        String userSentence = sentence.nextLine();
        System.out.printf("%s%n", userSentence);
    }
}
class CodeupPerimeter {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter a length:");
        String userLength = s.nextLine();
        System.out.println("Length: " + userLength + " ft");
        System.out.print("Enter a width:");
        String userWidth = s.nextLine();
        System.out.println("Width: " + userWidth + " ft");
        int userLengthParsed = Integer.parseInt(userLength);
        int userWidthParsed = Integer.parseInt(userWidth);
        int area = userLengthParsed * userWidthParsed;
        int perimeter = (userLengthParsed * 2) + (userWidthParsed * 2);
        System.out.printf("Area: %s sqft%nPerimeter: %s ft%n", area, perimeter);
    }
}
class CodeupPerimeterReFactor {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Enter a length, width, and height:");
        float userLength = s.nextFloat();
        s.nextLine();
//        System.out.println("Length: " + userLength + " ft");
        float userWidth = s.nextFloat();
        s.nextLine();
//        System.out.println("Width: " + userWidth + " ft");
        float userHeight = s.nextFloat();
        float area = userLength * userWidth;
        float perimeter = (userLength * 2) + (userWidth * 2);
        float volume = userLength * userHeight * userWidth;
        System.out.printf("Area: %s ft\u00B2%nPerimeter: %s ft%nVolume: %s ft\u00B3%n ", area, perimeter, volume);
    }
}

