package java_journey.Day10;
class F
{
    public void showTheDataWhichBelongsToThisClass()
    {
        System.out.println("in F show");
    }
}
class G extends F
{
    @Override
    public void showTheDataWhichBelongsToThisClass()
    {
        System.out.println("in G show");
    }
}

public class Annotations{
    public static void main(String a[])
    {
       G obj = new G();
       obj.showTheDataWhichBelongsToThisClass();
        

    }
}