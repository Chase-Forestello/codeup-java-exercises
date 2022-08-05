//Complete - Java I - Methods Exercise

import java.math.BigInteger;
import java.util.Scanner;


public class MethodsExercises {
    public static void main(String[] args) {
//        System.out.println(returnAddition(1, 0));
//        System.out.println(returnSubtraction(3, 1));
//        System.out.println(returnMultiplication(3, 1));
//        System.out.println(returnDivision(16, 4));
//        System.out.println(returnMod(5, 25));
//        System.out.println(multiplyWithoutMultiplying(2, 3));
//        System.out.println(multiplier(5, 5));
//        System.out.println(getInteger(1, 25));
        System.out.println(getFactorial());
//        System.out.println(diceRoll());
    }

    static Scanner s = new Scanner(System.in);

    public static int returnAddition(int num1, int num2) {
        return num1 + num2;
    }

    public static int returnSubtraction(int num1, int num2) {
        return num1 - num2;
    }

    public static int returnMultiplication(int num1, int num2) {
        return num1 * num2;
    }

    public static int returnDivision(int num1, int num2) {
        return num1 / num2;
    }

    public static int returnMod(int num1, int num2) {
        return num1 % num2;
    }

    public static int multiplyWithoutMultiplying(int num1, int num2) {
        int n = 0;
        for (int i = 0; i < num1; i++) {
            n += num2;
        }
        return n;
    }

    public static int multiplier(int num1, int num2) {

        if ((num1 == 0) || (num2 == 0)) return 0;
        else return (num1 + multiplier(num1, num2 - 1));
    }

    public static int getInteger(int min, int max) {
        System.out.printf("Enter a number between %s and %s:", min, max);
        int userInput = s.nextInt();
        if (userInput >= min && userInput <= max) {
            return userInput;
        }
        return userInput = getInteger(min, max);
    }

// This was a nightmare. Don't overthink problems!
//    50 is breaking point, 49! = 8.7 quintillion.

    public static long getFactorial() {
        System.out.println("Welcome to my factorial program.");
        long userNum = getInteger(1, 1000);
        long fact = 1;
        for (int i = 2; i <= userNum; i++) {
            fact = fact * i;
        }
        System.out.print(userNum + "! = ");
        int factor = 1;
        for (int i = 1; i <= userNum; i++) {
            if (i == userNum) {
                System.out.print(factor + " = ");
            } else {
                System.out.print(factor + " x ");
            }
            factor += 1;
        }
        return fact;
    }

    public static String diceRoll() {
        String goodbye = "Goodbye!";
        System.out.print("Enter a custom number of sides for a pair of dice:");
        int dice = s.nextInt();
        System.out.print("Ready to roll? [y , n]:");
        String userConfirm = s.next();
        boolean confirm = userConfirm.equals("y");
        if (confirm) {
            System.out.println("First roll: " + (int) (Math.random() * (dice - 1)));
            System.out.println("Second roll: " + (int) (Math.random() * (dice - 1)));
            System.out.print("Roll again? [y , n]:");
            String rollAgain = s.next();
            boolean again = rollAgain.equals("y");
            if (again) {
                diceRoll();
            }
        }
        return goodbye;
    }
}

