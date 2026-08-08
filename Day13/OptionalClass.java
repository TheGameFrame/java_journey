package java_journey.Day13;

import java.util.*;

public class OptionalClass
{
    public static void main(String[] args) {

        List<String> names = Arrays.asList("Laxmi", "Kiran", "John", "Harshil");

        String name = names.stream()
                        .filter(str -> str.contains("x"))
                        .findFirst()
                        .orElse("Not Found");

        System.out.println(name);

    }
}