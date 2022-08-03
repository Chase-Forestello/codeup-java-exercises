import java.util.Scanner;

public class ControlFlowExercises {
    public static void main(String[] args) {
//        int i = 5;
//        while (i <= 15){
//            System.out.print(i + " ");
//            i++;}

//        int i = 0;
//        do {
//            System.out.print(i + " ");
//            i+=2;
//        } while (i <= 100);

//            int i = 100;
//            do {
//                System.out.print(i + " ");
//                i-=5;
//            } while (i >= -10);

//        long i = 2;
//        do {
//            System.out.println(i);
//            i = i*i;
//        } while (i < 1000000);

//        for (int i = 5; i <= 15 ; i++) {
//            System.out.print(i + " ");
//        }

//        for (int i = 0; i <= 100 ; i+=2) {
//            System.out.println(i);
//        }

//        for (int i = 100; i >= -10 ; i-=5) {
//            System.out.print(i + " ");
//        }

//        for (long i = 2; i < 1000000 ; i*=i) {
//            System.out.println(i);
//        }

//        for (int i = 0; i <=100 ; i++) {
//            if (i % 3 == 0 && i % 5 == 0){
//                System.out.print("FizzBuzz, ");
//            }
//            else if (i % 3 == 0){
//                System.out.print("Fizz, ");
//            } else if (i % 5 == 0){
//                System.out.print("Buzz, ");
//            } else {
//                System.out.print(i + ", ");
//            }
//        }

        Scanner s = new Scanner(System.in);
//        System.out.print("What would you like to sqube to?:");
//        long userInput = s.nextInt();
//        System.out.println("number | squared | cubed");
//        System.out.println("------ | ------- | ----- ");
//        for (long i = 1; i <= 3; i++) {
//            System.out.println(" " + i + "     | " + i * i + "       | " + i * i * i);
//        }
//        for (long i = 4; i <= userInput; i++) {
//            System.out.println(" " + i + "     | " + i * i + "      | " + i * i * i);
//        }
//        s.nextLine();
//        System.out.print("Continue? [y / n]");
//        String userRes = s.next();
//        boolean confirmation = userRes.equals("y");
//
//        if (confirmation) {
//            for (long i = userInput; i <= 1000; i++) {
//                System.out.println(" " + i + "     | " + i * i + "      | " + i * i * i);
//            }
//        }

//        s.nextLine();

        boolean confirmation;
        do {
            System.out.print("Enter a numerical grade from 0 to 100:");
            int userGrade = s.nextInt();
            if (userGrade <= 59) {
                System.out.println("Your grade: F");
            } else if (userGrade <= 64) {
                System.out.println("Your grade : D");
            } else if (userGrade <= 69) {
                System.out.println("Your grade : D+");
            } else if (userGrade <= 77) {
                System.out.println("Your grade : C");
            } else if (userGrade <= 79) {
                System.out.println("Your grade : C+");
            } else if (userGrade <= 87) {
                System.out.println("Your grade : B");
            } else if (userGrade <= 89) {
                System.out.println("Your grade : B+");
            } else if (userGrade <= 98) {
                System.out.println("Your grade : A");
            } else if (userGrade <= 100) {
                System.out.println("Your grade : A+");
            }
            s.nextLine();
            System.out.print("Continue? [y / n]");
            String userRes = s.next();
            confirmation = userRes.equals("y");
        } while (confirmation);
    }
}
