package java_journey.Day13;
import java.util.*;

public class NeedOfStreamAPI
{
    public static void main(String[] args) {
        
        List<Integer> nums = Arrays.asList(4, 5, 7, 3, 2, 6);

        /* for(int i=0;i<nums.size();i++)     //<- Normal For Loop
            {
                System.out.println(nums.get(i));
            }
 

            /* for(int n : nums)             //<- Enhanced For Loop
                {
                    System.out.println(n);
                } */

        nums.forEach(n -> System.out.println(n));     //<- for each method

    }
}