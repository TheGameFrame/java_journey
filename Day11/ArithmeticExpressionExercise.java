package java_journey.Day11;

public class ArithmeticExpressionExercise {
    public static void main(String[] args) {
        int numerator = 50;
        int denominator = 0;

        try
        {
          int k = numerator / denominator;
  
        }
        catch(ArithmeticException e)
        {
          System.out.println("Cannot divide by 0");
        }
        finally
        {
        System.out.println("Program completed");
        }

      
    }
}
