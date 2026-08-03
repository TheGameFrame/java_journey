package java_journey.Day8;

class Calcu
{
    public int add(int n1, int n2)
    {
        return n1 + n2;
    }
}
class AdvCalcu extends Calcu
{
   public int add(int n1, int n2)
   {
       return n1 + n2 + 1;
   }
    
}

public class MethodOverriding {
    public static void main(String a[]) 
    {
      AdvCalcu obj = new AdvCalcu();
      int r1 = obj.add(3, 4);
      System.out.println(r1);
    }
}