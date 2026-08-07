package java_journey.Day12;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;


class Student
{
    int age;
    String name;
    

    public Student(int age, String name) {
        this.age = age;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student [age = " + age + ", name = " + name + "]";
    }
    
}

public class ComparatorVsComparable {
    public static void main(String[] args) 
    {
        Comparator<Student> com =  (i, j) ->  i.age>j.age?1:-1;

        List<Student> nums = new ArrayList<>();
        nums.add(new Student(21, "John"));
        nums.add(new Student(20, "Jane"));
        nums.add(new Student(14, "Archie"));
        nums.add(new Student(17, "Harshil"));

        
        Collections.sort(nums, com);
        for(Student s : nums)
        System.out.println(s);

    }
}