package java_journey.Day7;

public class ImmutableStrings {
    public static void main(String a[]) 
    {
        String name = "John";
        name = name + " Doe";

        System.out.println("Hello, " + name + "!");

        String s1 = "john"; //One object, two refrences ("john")
        String s2 = "john";
        System.out.println(s1==s2); //true
        //s1"john" = address 103
        //s2"john" = address 103 (They're the same thing therefore new object isn't created)

        //Mutuable string means it can be changed, immutable means it cannot be changed. String is immutable in java.


    }
    
}
