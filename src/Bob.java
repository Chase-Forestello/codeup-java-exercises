// Complete - Java I - Strings Bob Exercise
import java.util.Scanner;

public class Bob {
    public static void main(String[] args) {
        System.out.println("Hello, welcome to Bob-bot.\nType something in console to talk to Bob-bot\nType 'stop' to stop the program.");
        Scanner s = new Scanner(System.in);
//        boolean confirmation;
            System.out.println("Bob-bot: Hey.");
        do{
            System.out.print("You:");
            String userInput = s.nextLine();
            boolean isEmpty = userInput.isEmpty();
            boolean yelling = userInput.endsWith("!");
            boolean question = userInput.endsWith("?");
            boolean stop = userInput.equals("stop");
            if (isEmpty) { // Checking for empty string.
                System.out.println("Fine. Be that way!");
            } else if(yelling){ // Checking for exclamation mark.
                System.out.println("Whoa, chill out!");
            } else if (question) { // Checking for question mark.
                System.out.println("Sure.");
            } else if (stop){ // Checking for "stop".
                break;
            } else { // Checking for any other input aside from "",!,?,stop.
                System.out.println("Whatever.");
            }
            // Checking if user wants to continue talking with Bob-bot, currently
            // automated so user only needs to type "stop" when done rather than
            // continuously confirm the prompt.
//            System.out.print("Keep talking to Bob-bot? [y / n]:");
//            String userContinue = s.next();
//            confirmation = userContinue.equals("y");
        } while(true); // Do while loop is always true until break condition ("stop") is met.
    }
}
