package java_journey.Day11;
class JohnException extends Exception
{

  public JohnException(String string) 
  {
    super(string);
  }
  
}

public class CustomException {
    public static void main(String a[])
    {
      int i = 20;
      int j = 0;

      try
      {
        j = 18/i;
        if(j==0)
          {
            throw new JohnException("I don't want to print zero");
          }
      }
      
      catch(JohnException e)
      {
        j = 18/1;
        System.out.println("thats the default output " + e);      
      }

      catch(Exception e)
      {
        System.out.println("Something went wrong..." + e);
      }
      System.out.println(j);
      System.out.println("bye");
    }
}