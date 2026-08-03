package java_journey.Day8.AccessModifiers;
import java_journey.Day8.AccessModifiers.other.*;

class C extends A
{
  public void abc()
  {
    A obj = new A();
    System.out.println(obj.marks);
  }
}

public class AccessModifiers {
    public static void main(String a[]) 
    {
      A obj = new A();
      System.out.println(obj.marks);   
      obj.show();

      //B obj1 = new B();
      //System.out.println(obj1.marks);    //doesn't work because marks in B is private
    }
}
