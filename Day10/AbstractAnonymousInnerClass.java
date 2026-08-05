package java_journey.Day10;

abstract class D
{
    public abstract void show();
    public abstract void config();
}

public class AbstractAnonymousInnerClass{
    public static void main(String a[])
    {
        D obj = new D()
        {
            public void show()
            {
               System.out.println("in new Show");
            }

            public void config()
            {
                System.out.println("in config");
            }
        };
        obj.show();
    }
}