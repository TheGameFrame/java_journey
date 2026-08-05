// class - class -> extends
// class - interface -> implements
// interface - interface -> extends

package java_journey.Day10;
interface a  //interface is like a class but the methods are public abstract instead of normal
{
    int age=44;    //final and static
    String area="New Delhi";

    void show();
    void config();
}
interface X
{
    void run();
}

interface Y extends X
{

}

class b implements a, Y
{
    public void show()
    {
        System.out.println("in show");
    }

    public void config()
    {
        System.out.println("in config");
    }

    public void run()
    {
        System.out.println("Running...");
    }
}

public class WhatIsInterface{
    public static void main(String a[])
    {
       a obj;
       obj = new b();
       obj.show();
       obj.config();

       X obj1 = new b();
       obj1.run();

       System.out.println(b.area);
    }
}