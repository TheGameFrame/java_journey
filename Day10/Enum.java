enum Status  //constants
{
    Running, Failed, Pending, Success;
}

public class Enum{
    public static void main(String a[])
    {
        Status[] ss = Status.values();

        for(Status s: ss)
        {
            System.out.println(s + " : " + s.ordinal());
        }

        

    }
}