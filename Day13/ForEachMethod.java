package java_journey.Day13;
import java.util.*;

public class ForEachMethod
{
    public static void main(String[] args) {
        
        List<Integer> nums = Arrays.asList(4, 5, 7, 3, 2, 6);
           

        nums.forEach(n -> System.out.println(n));

        //nums.forEach(n -> System.out.println(n));     //<- for each method

    }
}