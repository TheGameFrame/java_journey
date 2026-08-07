package java_journey.Day12;

import java.util.HashMap;
import java.util.Map;

public class MapType {
    public static void main(String[] args) 
    {
        Map<String, Integer> students = new HashMap<>();

        students.put("John", 56);
        students.put("Jane", 23);
        students.put("Archie", 68);
        students.put("Harshil", 92);
        students.put("John", 15);

        System.out.println(students.keySet());

        for(String key : students.keySet())
            {
                System.out.println(key + " : " + students.get(key));
            }

    }
}