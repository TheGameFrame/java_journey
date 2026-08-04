package java_journey.Day9;
class D  //Final Class
{
    public final void show()  //final method
    {
        System.out.println("By John");
    }
    public void add(int a, int b)
    {
        System.out.println(a+b);
    }
}

class U extends D    //the show method in this class becomes invalid when the method with the same name in class D is final
{
    //public void show()
    //{
        //System.out.println("By Randall");
    //}
}


public class FinalKeyword {
    //final - variable, method, class
    //final variable - constants

    
    public static void main(String a[])
    {
        final int num = 8;    //Variables
        System.out.println(num);

        U obj = new U();
        obj.show();
        obj.add(4, 5);

    }

}