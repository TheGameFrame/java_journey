interface Machine
{
    String start();
}


abstract class Appliance implements Machine
{
    String start;
}

class Fan extends Appliance
{
    String start="Fan is running";

    @Override
    public String start() 
    {
        throw new UnsupportedOperationException("Unimplemented method 'start'");
    }
}


class WashingMachine extends Appliance
{
    String start="Washing Machine is operating";

    @Override
    public String start() 
    {
    
        throw new UnsupportedOperationException("Unimplemented method 'start'");
    }
}


public class WashingMachineFanExercise {
    public static void main(String[] args) {
        Fan obj = new Fan();
        WashingMachine obj1 = new WashingMachine();
        

        System.out.println(obj.start);
        System.out.println(obj1.start);
    }
}