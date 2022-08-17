// RPG console game
package rpg_console_game;

import java.util.Locale;
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
        } else if (mainMenuUserResponse.equalsIgnoreCase("how to play")) {
            System.out.println("ScrimmRPG is a very basic, console based, story adventure.");
            System.out.println("--------------------------------");
            System.out.println("Controls:");
            System.out.println("Type:\"forward\": to move forward\nType:\"back\": to move back\nType:\"left\": to move left\nType:\"right\": to move right");
            System.out.println("--------------------------------");
            mainMenu();
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

    static int playerDef;
    static int playerAtk;
    static String playerStatus;
    static String userAction;

    public static void classSelection() {
        System.out.print("What class are you, " + playerName + "?\n\n[ROGUE (low DEF high ATK)]\n\n[MAGE (low DEF high ATK)]\n\n[ARCHER (high DEF low ATK)]\n\nClass selection:");
        playerClass = s.nextLine().toLowerCase(Locale.ROOT);
        switch (playerClass) {
            case "rogue", "mage" -> {
                playerDef = 50;
                playerAtk = 20;
                playerStatus = "[" + String.valueOf(playerDef) + "HP] Action:";
                System.out.println("\n" + playerName + " the " + playerClass + ", you have: " + playerDef + "HP, " + playerAtk + "ATK.");
                storyStart();
            }
            case "archer" -> {
                playerDef = 100;
                playerAtk = 10;
                playerStatus = "[" + String.valueOf(playerDef) + "HP] Action:";
                System.out.println("\n" + playerName + " the " + playerClass + ", you have: " + playerDef + "HP, " + playerAtk + "ATK.");
                storyStart();
            }
            default -> {
                System.out.println("Enter a valid class!");
                classSelection();
            }
        }
    }

    public static void storyStart() {
        System.out.print("You suddenly awake in a forest, the air is thick with smoke and you hear a crackling sound.\n" + playerStatus);
        userAction = s.nextLine();
        if (userAction.equalsIgnoreCase("forward")) {
            storyFire();
        } else if (userAction.equalsIgnoreCase("back") || userAction.equalsIgnoreCase("left") || userAction.equalsIgnoreCase("right")) {
            System.out.println("You can't go that way");
            storyStart();
        } else {
            System.out.println("Not a command!");
            storyStart();
        }
    }

    public static void storyFire() {
        System.out.println("You walk forward, breaking through a thick section of brush to reveal a monolithic forest fire.");
        System.out.println("...");
        System.out.print("The smoke is much thicker now and you can feel the heat from the fire.\n" + playerStatus);
        theEnd();
    }

    public static void theEnd() {
        String userAction = s.nextLine();
        if (userAction.equalsIgnoreCase("left") || userAction.equalsIgnoreCase("right")) {
            System.out.println("You can't do that here, sorry!");
            storyFire();
        } else if (userAction.equalsIgnoreCase("back")){
            back();
        }else if (userAction.equalsIgnoreCase("forward")) {
            death();
        } else {
            System.out.println("Not a command!");
            storyFire();
        }
    }
    public static void death(){
        System.out.println("Chase took " + playerDef + " damage from [Monolithic Forest Fire]");
        System.out.println("--YOU HAVE DIED--");
    }

    public static void close() {
        System.out.println("Goodbye!");
    }
    public static void back(){
        System.out.println("You re-trace your steps back into the thick brush");
        System.out.print("The smoke is thicker here now too. You feel intense heat in every direction.\n" + playerStatus);
        userAction = s.nextLine();
        if (userAction.equalsIgnoreCase("right") || userAction.equalsIgnoreCase("back") || userAction.equalsIgnoreCase("left")) {
            System.out.println("You can't do that here, sorry!");
            back();
        } else if (userAction.equalsIgnoreCase("forward")) {
            storyFire();
        } else {
            System.out.println("Not a command!");
            back();
        }
    }
}