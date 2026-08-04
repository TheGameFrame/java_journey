package java_journey.Day9;
public class WrapperClasses {
    
    
    public static void main(String a[])
    {
        int num = 7; //Better way
        Integer num1 = num;  //autoboxing

        int num2 = num1; //auto-unboxing

        System.out.println(num2);

        String str = "12";
        int num3 = Integer.parseInt(str);  //Converts string to integer
        System.out.println(num3*2);


    }

}