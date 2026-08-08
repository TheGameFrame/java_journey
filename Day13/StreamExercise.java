package java_journey.Day13;
import java.util.*;
import java.util.stream.*;

public class StreamExercise {
    public static void main(String[] args) {

        List<String> products = Arrays.asList("Laptop", "Pen", "Notebook", "Headphones","Smartphone");

        System.out.println("Original List: " + products);

        List<String> filteredProducts = products.stream()
                .filter(product -> product.length() > 5)
                .map(String::toUpperCase)
                .sorted()
                .collect(Collectors.toList());

        System.out.println("Filtered Products: " + filteredProducts);
    }
}