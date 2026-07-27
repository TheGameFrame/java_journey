public class Ternary {
    public static void main (String[] args) 
    {
       int n = 5;
       int result = 0;

       //if (n%2==0)
       //result = 10;
      //else
       //result = 20;

      result = n%2==0?10:20; //Compressed 4 lines of code into 1 :DD

      System.out.println(result);

    }}