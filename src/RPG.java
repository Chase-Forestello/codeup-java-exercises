// RPG console game
import java.util.Scanner;

public class RPG {
    static Scanner s = new Scanner(System.in);
    public static void main(String[] args) {
        gameStart();

    }
    public static void gameStart () {
        System.out.println("Welcome to ScrimmRPG!");
        System.out.print("[START] [CLOSE] [HOW TO PLAY]:");
        String mainMenuUserResponse = s.nextLine();
        if (mainMenuUserResponse.equals("start")) {
            start();
        } else if (mainMenuUserResponse.equals("close")) {
            close();
        } else {
            gameStart();
        }

    }

    public static void start () {
        System.out.println("Let's begin.");
        System.out.print("What is your name adventurer?:");
        String playerName = s.nextLine();
        int playerHealth = 100;
        System.out.println();
    }

    public static void close () {
        System.out.println("Goodbye!");
    }
}
