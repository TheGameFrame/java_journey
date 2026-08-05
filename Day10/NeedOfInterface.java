package java_journey.Day10;
interface Computer
{
    void code();
}

class Laptop implements Computer
{
    public void code()
    {
        System.out.println("code, compile. run");    
    }
}
class Desktop implements Computer
{
    public void code()
    {
        System.out.println("code, compile, run : Faster");
    }
}

class Dev
{
    public void devApp(Computer lap)
    {
        lap.code();
    }
}

public class NeedOfInterface{
    public static void main(String a[])
    {
        Computer lap = new Laptop();
        Computer desk = new Desktop();


        Dev harshil = new Dev();
        harshil.devApp(lap);
    }
}