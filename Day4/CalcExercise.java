public class CalcExercise {
    public static void main(String[] args) {

        double num1 = 7;
        double num2 = 3;
        char operator = '+';
        String again = "y";

        // Run the loop while 'again' equals 'y'
        while (again.equals("y")) {

            // Perform the calculation based on the operator
            if (operator == '+') {
                System.out.println("Result: " + (num1 + num2));
            } else if (operator == '-') {
                System.out.println("Result: " + (num1 - num2));
            } else if (operator == '*') {
                System.out.println("Result: " + (num1 * num2));
            } else if (operator == '/') {
                if (num2 == 0) {
                    System.out.println("Cannot divide by zero.");
                } else {
                    System.out.println("Result: " + (num1 / num2));
                }
            } else {
                System.out.println("Invalid operator.");
            }

            // Stop the loop after one execution
            again = "n";
        }

        // Display a thank you message
        System.out.println("Thank you for using the calculator.");
    }
}