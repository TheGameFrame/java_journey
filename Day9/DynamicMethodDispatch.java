package java_journey.Day9;
class A
{
    public void show(){
        System.out.println("in A show");
    }
}
class B extends A
{
    public void show()
    {
        System.out.println("in B show");
    }
}

class C extends A
{
    public void show()
    {
        System.out.println("in C show");
    }
}


public class DynamicMethodDispatch {
    
    
    public static void main(String a[])
    {
        A obj = new A();  //Dynamic Method Dispatch
        obj.show();

        obj = new B();
        obj.show();

        obj = new C();    //Needs to extend in order for this line to be valid
        obj.show();
    }

}