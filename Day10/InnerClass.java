class A
{
    int age;

    public void show()
    {
        System.out.println("in show");
    }
    static class B
    {
        public void config()
        {
            System.out.println("in config");        
        }
    }
}

public class InnerClass{
    public static void main(String a[])
    {
        A obj = new A();
        obj.show();

        A.B obj1 = new A.B();  //only works with static class
        obj1.config();

    }
}