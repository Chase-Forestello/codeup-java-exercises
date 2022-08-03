public class MethodsExercises {
    public static void main(String[] args) {
        System.out.println(returnAddition(1,0));
        System.out.println(returnSubtraction(3,1));
        System.out.println(returnMultiplication(3,1));
        System.out.println(returnDivision(16,4));
        System.out.println(returnMod(5,25));
        System.out.println(multiplyWithoutMultiplying(2,3));
        System.out.println(multiplier(7,1));
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
}
