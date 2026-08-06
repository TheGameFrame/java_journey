enum Status  //constants
{
    Running, Failed, Pending, Success;
}

public class EnumIfElseSwitch{
    public static void main(String a[])
    {
        Status s = Status.Running;

        switch(s)
        {
            case Running:
            System.out.println("All Good");
            break;

            case Failed:
            System.out.println("Try Again!");
            break;

            case Pending:
            System.out.println("Please Wait");
            break;

            default:
            System.out.println("done!");
            break;
        }
           
                
        

    }
}