// Complete - Java I - Control Flow Exercises
import java.util.Scanner;

public class ControlFlowExercises {
    public static void main(String[] args) {
//        Counting from 5 to 15 program
//        int i = 5;
//        while (i <= 15){
//            System.out.print(i + " ");
//            i++;}

//        Counting to 100 by 2 program
//        int i = 0;
//        do {
//            System.out.print(i + " ");
//            i+=2;
//        } while (i <= 100);

//        Counting down from 100 by -5 program
//            int i = 100;
//            do {
//                System.out.print(i + " ");
//                i-=5;
//            } while (i >= -10);

//        Square i program
//        long i = 2;
//        do {
//            System.out.println(i);
//            i = i*i;
//        } while (i < 1000000);

//        5 to 15 refactored for loop
//        for (int i = 5; i <= 15 ; i++) {
//            System.out.print(i + " ");
//        }

//        Counting to 100 by 2 refactored for loop
//        for (int i = 0; i <= 100 ; i+=2) {
//            System.out.println(i);
//        }

//        Counting down from 100 by -5 refactored for loop
//        for (int i = 100; i >= -10 ; i-=5) {
//            System.out.print(i + " ");
//        }

//        square i refactored for loop
//        for (long i = 2; i < 1000000 ; i*=i) {
//            System.out.println(i);
//        }

//        FizzBuzz program
        for (int i = 0; i <=100 ; i++) {
            if (i % 3 == 0 && i % 5 == 0){
                System.out.print("FizzBuzz, ");
            }
            else if (i % 3 == 0){
                System.out.print("Fizz, ");
            } else if (i % 5 == 0){
                System.out.print("Buzz, ");
            } else {
                System.out.print(i + ", ");
            }
        }
            System.out.println("\n");


//        Square & cube table program:
        Scanner s = new Scanner(System.in);
        System.out.print("What would you like to sqube to?:");
        long userInput = s.nextInt();
        System.out.println("number | squared | cubed");
        System.out.println("------ | ------- | ----- ");
        for (long i = 1; i <= 3; i++) {
            System.out.println(" " + i + "     | " + i * i + "       | " + i * i * i);
        }
        for (long i = 4; i <= userInput; i++) {
            System.out.println(" " + i + "     | " + i * i + "      | " + i * i * i);
        }
        s.nextLine();
        System.out.print("Continue? [y / n]");
        String userContinue = s.next();
        boolean userConfirmation = userContinue.equals("y");

        if (userConfirmation) {
            for (long i = userInput; i <= 1000; i++) {
                System.out.println(" " + i + "     | " + i * i + "      | " + i * i * i);
            }
        }

        s.nextLine();

//        Grading program:

//        boolean confirmation;
//        do {
//            System.out.print("Enter a numerical grade from 0 to 100:");
//            int userGrade = s.nextInt();
//            if (userGrade <= 59) {
//                System.out.println("Your grade: F");
//            } else if (userGrade <= 64) {
//                System.out.println("Your grade : D");
//            } else if (userGrade <= 69) {
//                System.out.println("Your grade : D+");
//            } else if (userGrade <= 77) {
//                System.out.println("Your grade : C");
//            } else if (userGrade <= 79) {
//                System.out.println("Your grade : C+");
//            } else if (userGrade <= 87) {
//                System.out.println("Your grade : B");
//            } else if (userGrade <= 89) {
//                System.out.println("Your grade : B+");
//            } else if (userGrade <= 98) {
//                System.out.println("Your grade : A");
//            } else if (userGrade <= 100) {
//                System.out.println("Your grade : A+");
//            }
//            s.nextLine();
//            System.out.print("Continue? [y / n]");
//            String userRes = s.next();
//            confirmation = userRes.equals("y");
//        } while (confirmation);

//        Switch statement version of grading program:

        boolean confirmation;
        do {
            System.out.print("Enter a numeric grade:");
            int userGrade = s.nextInt();
            String dayString = switch (userGrade) {
                case 99, 100 -> "A+";
                case 90, 91, 92, 93, 94, 95, 96, 97, 98 -> "A";
                case 88, 89 -> "B+";
                case 80, 81, 82, 83, 84, 85, 86, 87 -> "B";
                case 78, 79 -> "C+";
                case 70, 71, 72, 73, 74, 75, 76, 77 -> "C";
                case 68, 69 -> "D+";
                case 60, 61, 62, 63, 64, 65, 66, 67 -> "D";
                default -> "F";
            };
            System.out.println(dayString);
            s.nextLine();
            System.out.print("Continue? [y / n]");
            String userRes = s.next();
            confirmation = userRes.equals("y");
        } while (confirmation);
    }
}
