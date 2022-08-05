// RPG console game

import java.util.Scanner;

public class RPG {
    static Scanner s = new Scanner(System.in);
    public static void main(String[] args) {
        mainMenu();

    }

    public static void mainMenu() {
        System.out.println("Welcome to ScrimmRPG!");
        System.out.print("[START] [CLOSE] [HOW TO PLAY]:");
        String mainMenuUserResponse = s.nextLine();
        if (mainMenuUserResponse.equalsIgnoreCase("start")) {
            start();
        } else if (mainMenuUserResponse.equalsIgnoreCase("close")) {
            close();
        } else {
            mainMenu();
        }
    }

    static String playerClass;
    static String playerName;

    public static void start() {
        System.out.println("Let's begin.");
        System.out.print("What is your name adventurer?:");
        playerName = s.nextLine();
        if (playerName.matches("[a-zA-Z]+$")) {
            classSelection();
        } else {
            System.out.println("Player name can only contain alphabetical characters a-Z.");
            start();
        }
    }

    public static void classSelection() {
        int playerHealth;
        System.out.print("What class are you " + playerName + "?\n[ROUGE (low DEF high ATK)]\n[MAGE (low DEF high ATK)]\n[ARCHER (high DEF low ATK)]\nClass selection:");
        playerClass = s.nextLine();
        switch (playerClass) {
            case "rouge", "mage" -> {
                playerHealth = 50;
                System.out.println(playerName + " the " + playerClass + ", you have: " + playerHealth + "HP.");
            }
            case "archer" -> {
                playerHealth = 100;
                System.out.println(playerName + " the " + playerClass + ", you have: " + playerHealth + "HP.");
            }
            default -> {
                System.out.println("Enter a valid class!");
                classSelection();
            }
        }
    }

    public static void close() {
        System.out.println("Goodbye!");
    }
}
