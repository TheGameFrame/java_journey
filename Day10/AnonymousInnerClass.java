package java_journey.Day10;

class C
{
    public void show()
    {
        System.out.println("in C show");
    }
}

public class AnonymousInnerClass{
    public static void main(String a[])
    {
        C obj = new C()
        {
        public void show()
    {
        System.out.println("in new show");
    }
        };
        obj.show();

    }
}