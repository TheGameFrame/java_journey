package java_journey.Day12;

class Hi extends Thread
{
    public void run()
    {
        for(int i=1;i<=100;i++)
            {
                System.out.println("hi");
            }
    }
}

class Hello extends Thread
{
    public void run()
    {
        for(int i=1;i<=100;i++)
            {
                System.out.println("hello");
            }
    }
}
public class MultipleThreads {

    public static void main(String a[])
    {
        Hi obj1 = new Hi();
        Hello obj2 = new Hello();

        obj1.start();
        obj2.start();

    }
    
}
