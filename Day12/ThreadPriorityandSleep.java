package java_journey.Day12;

class Hi extends Thread
{
    public void run()
    {
        for(int i=1;i<=100;i++)
            {
                System.out.println("hi");
                try {
                    Thread.sleep(10);
                } catch (InterruptedException e) { e.printStackTrace();
                }
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
                try {
                    Thread.sleep(10);
                } catch (InterruptedException e) { e.printStackTrace();
                }
            }
    }
}
public class ThreadPriorityandSleep {

    public static void main(String a[])
    {
        Hi obj1 = new Hi();
        Hello obj2 = new Hello();


        obj1.start();
        try
        {
            Thread.sleep(2);
        }
        catch (InterruptedException e)
        {
            e.printStackTrace();
        }

        obj2.start();

    }
    
}
