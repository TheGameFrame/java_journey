package java_journey.Day13;
import java.util.*;
import java.util.stream.Stream;

public class MapFilterReduceSorted
{
    public static void main(String[] args) {
        
        List<Integer> nums = Arrays.asList(4, 5, 7, 3, 2, 6);

        //Predicate<Integer> p = t -> t%2==0;

        //Function<Integer, Integer> fun = (Integer n) -> n*2;

        Stream<Integer> sortedValues = nums.stream()
            .filter(n -> n%2==0)
            .sorted();

        sortedValues.forEach(n -> System.out.println(n));

    }
}