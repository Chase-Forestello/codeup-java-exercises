// Incomplete (stuck on #2) - Java I - Methods Exercise
import java.util.Scanner;
public class MethodsExercises {
    public static void main(String[] args) {
        System.out.println(returnAddition(1,0));
        System.out.println(returnSubtraction(3,1));
        System.out.println(returnMultiplication(3,1));
        System.out.println(returnDivision(16,4));
        System.out.println(returnMod(5,25));
        System.out.println(multiplyWithoutMultiplying(2,3));
        System.out.println(multiplier(7,1));
//        System.out.print("Enter a number between 1 and 10:");
//        System.out.println(getInteger(1, 10));
    }
        public static int returnAddition(int num1, int num2){
            return num1 + num2;
        }
        public static int returnSubtraction(int num1, int num2){
            return num1 - num2;
        }
        public  static int returnMultiplication(int num1, int num2){
            return num1 * num2;
        }
        public static int returnDivision(int num1, int num2){
            return num1 / num2;
        }
        public static int returnMod(int num1, int num2){
            return num1 % num2;
        }
        public static int multiplyWithoutMultiplying(int num1, int num2){
        int n = 0;
            for (int i = 0; i < num1 ; i++) {
                n += num2;
            }
                return n;
        }

        public static int multiplier(int num1, int num2) {

        if ((num1 == 0) || (num2 == 0))
            return 0;
        else
            return (num1 + multiplier(num1, num2 - 1));
        }
// ?????????????????????????????????????????????????????????????
        public static boolean getInteger (int min, int max) {
        Scanner s = new Scanner(System.in);
        int userInput = s.nextInt();
        if (userInput > min && userInput< max){
            System.out.println(userInput);
        } else {
            getInteger(1,10);
        }
            return false;
        }
}
