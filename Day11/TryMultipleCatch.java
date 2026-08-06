package java_journey.Day11;

public class TryMultipleCatch {
    public static void main(String a[])
    {
      int i = 2;
      int j = 0;

      int nums[] = new int[5];
      String str = null;

      try
      {
        j = 18/i;
        System.out.println(str.length());
        System.out.println(nums[5]);
      }
      
      catch(ArithmeticException e)
      {
        System.out.println("Cannot divide by 0");
      }
      catch(ArrayIndexOutOfBoundsException e)
      {
        System.out.println("Array index is out of bounds");
      }
      catch(Exception e)
      {
        System.out.println("Something went wrong..." + e);
      }
      System.out.println(j);
      System.out.println("bye");
    }
}