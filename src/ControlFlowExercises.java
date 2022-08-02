public class ControlFlowExercises {
    public static void main(String[] args) {
        long i = 2;
        do {
            System.out.println(i);
            i = i*i;
        } while (i < 1000000);
    }
}
