package java_journey.Day9;

class F
{
    public void show()
    {
        System.out.println("In F show");
    }
}
class H extends F
{
    public void show2()
    {
        System.out.println("In H show");
    }

    
}

public class UpcastingDowncasting {
    
    
    public static void main(String a[])
    {
        F obj = (F)new H(); //upcasting
        obj.show();

        H obj1 = (H)obj;  //Downcasting
        obj1.show2();
    }

}