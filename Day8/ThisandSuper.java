package java_journey.Day8;

class C
{
    public C()
    {
        super();
        System.out.println("In C");
    }

    public C(int x)
    {
        super();
        System.out.println("In C int");
    }
}

class D extends C
{
    public D()
    {
        super();
        System.out.println("In D");
    }

    public D(int x)
    {
        this();
        System.out.println("In D int");
    }

}

public class ThisandSuper {
    public static void main(String a[]) 
    {
       D obj = new D(5);
    }
}