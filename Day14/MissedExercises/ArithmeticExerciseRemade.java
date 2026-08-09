package MissedExercises;
public class ArithmeticExerciseRemade {
    public static void main(String[] args) {
        int numerator = 50;
        int denominator = 0;

        try {
            int k = numerator / denominator;
        } catch (ArithmeticException e) {
            System.out.println("Cannot divide by zero");
        }

        System.out.println("Program completed");
    }
}