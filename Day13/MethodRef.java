package java_journey.Day13;
import java.util.*;

public class MethodRef
{
    public static void main(String[] args) {

        List<String> names = Arrays.asList("Lakhsmi", "Harshil", "John");

        List<String> uNames = names.stream()
                                .map(String::toUpperCase)
                                .toList();

        uNames.forEach(System.out::println);
       

    }
}