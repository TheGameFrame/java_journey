package java_journey.Day11;

class C
{
  public void show() throws ClassNotFoundException
  {
    Class.forName("Calc");
  }
}

public class DuckingExceptionUsingThrows {

  static{
    System.out.println("Class Loaded");

  }
    public static void main(String a[]){
      
      C obj = new C();
      try {
        obj.show();
      } catch (ClassNotFoundException e) {
        e.printStackTrace();
      }

    }}