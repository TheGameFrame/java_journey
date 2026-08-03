package java_journey.Day7;

public class StringBufferBuilder {
    public static void main(String a[]) 
    {
        StringBuffer sb = new StringBuffer("John");
        sb.append(" Doe"); //Adds " Doe" to "John" and returns "John Doe"

        //sb.deleteCharAt(2); //Deletes index 2 of "John" (3rd letter) and returns "Jon"

        sb.insert(5, "Java "); //Inserts "Java " at index 5 of "John Doe" and returns "John Java Doe"
        sb.setLength(30); //Sets the length of the string to 30 characters

        System.out.println(sb);
        //String str = sb.toString(); //Converts StringBuffer to String

    }
    
}
