class Calculator
{
    int a;
    int add(int n1, int n2)
    {
        int r = n1 + n2;
        return r;
        
    }
}

public class ClassesObjects {
    public static void main (String[] args) 
    {
      int num1=11;
      int num2=15; 

      Calculator calc = new Calculator();
      int result = calc.add(num1, num2);
      System.out.println(result);

    }}