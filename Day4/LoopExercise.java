public class LoopExercise {
    public static void main(String[] args) {

        // For loop
        System.out.print("For Loop: ");
        for (int i = 1; i <= 5; i++) {
            System.out.print(i + " ");
        }

        // Move to the next line
        System.out.println();

        // While loop
        int j = 1;
        System.out.print("While Loop: ");
        while (j <= 5) {
            System.out.print(j + " ");
            j++;
        }

        // Move to the next line
        System.out.println();

        // Do-while loop
        int k = 1;
        System.out.print("Do-While Loop: ");
        do {
            System.out.print(k + " ");
            k++;
        } while (k <= 5);
    }
}