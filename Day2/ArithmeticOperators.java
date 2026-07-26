public class ArithmeticOperators {
    public static void main (String[] args) 
    {
        //Arithmetic Operators
        int num = 7;
        num++;  //post increment
        ++num;  //pre increment

        int result = num++; //(fetch value, then increment)
        //int result = ++num; (increment first, then fetch value)
        System.out.println(result);

    }}