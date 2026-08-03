package java_journey.Day8;

class A
{
    public A()
    {
        System.out.println("object created");
    }
    public void show()
    {
        System.out.println("in A show");
    }
}

public class AnonymousObject {
    public static void main(String a[]) 
    {
        //int marks;
        //marks = 99; //reference creation
        
        new A().show();  //anonymous object
    }
}