package java_journey.Day10;
abstract class Car  //Concept of a car
{
    public abstract void drive();   //Concpet of driving
    public abstract void fly();     

    public void playMusic()   //Abstract classes can have normal methods
    {
        System.out.println("play music");
    }
}

class UpdateWagonR extends WagonR   //concrete class
{
    public void fly()
    {
        System.out.println("Yeah i'm flying;...");
    }
}

abstract class WagonR extends Car  //Cannot create object of abstract class, must create a new class extending from the abstract class in order for the methods to work
{
    public void fly(){

        System.out.println("Flying...");
    }

    public void drive()
    {
        System.out.println("Driving...");
    }
}

public class Abstract 
{
    public static void main(String a[])
    {
        Car obj = new UpdateWagonR();
        obj.drive();
        obj.playMusic();
        obj.fly();

    }
}