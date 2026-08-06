package java_journey.Day11;

public class ExceptionHandlingWithTryCatch {
    public static void main(String a[])
    {
      int i = 0;
      int j = 0;

      try
      {
        j = 18/i;
      }
      
      catch(Exception e)
      {
        System.out.println("Something Went Wrong...");
      }
      System.out.println(j);
      System.out.println("bye");
    }
}