import java.util.Scanner;

public class HighLow {
    public static void main(String[] args) {
        Game();
    }

    static Scanner s = new Scanner(System.in);

    public static void Game() {
        int numberToGuess = (int) (Math.random() * 100) + 1;
        int userGuess;
        System.out.print("Guess the randomly generated number between 1 and 100:");
        int guessCount = 10;
        do {
            guessCount -= 1;
            userGuess = s.nextInt();
            if (userGuess > numberToGuess) {
                System.out.print("LOWER! (attempts left: " + guessCount + "): ");
            } else if (userGuess < numberToGuess) {
                System.out.print("HIGHER! (attempts left: " + guessCount + "): ");
            } else {
                System.out.println("GOOD GUESS! " + numberToGuess + " was the number! (You had " + guessCount + " attempts left)");
            }
        } while (guessCount > 0);
        System.out.println("Maximum number of guesses reached! The number was: " + numberToGuess);
    }

}
