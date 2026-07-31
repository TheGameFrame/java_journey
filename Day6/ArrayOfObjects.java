package java_journey.Day6;
class Student
{
    int rollno;
    String name;
    int marks;
}

public class ArrayOfObjects {
     public static void main(String a[])
{   
    //Student Arrays
    Student s1 = new Student();
    s1.rollno = 1;
    s1.name = "Alex";
    s1.marks = 88;

    Student s2 = new Student();
    s2.rollno = 2;
    s2.name = "Harshil";
    s2.marks = 93;

    Student s3 = new Student();
    s3.rollno = 3;
    s3.name = "Vinnie";
    s3.marks = 28;

    Student students[]= new Student[3];
    students[0] = s1;
    students[1] = s2;
    students[2] = s3;

    for(int i=0;i<students.length;i++)
    {
         System.out.println(students[i].name + " : " + students[i].marks);
    }



        //interger arrays (not important)

       //int nums [] = new int[4];

       //nums[0] = 4;
       //nums[1] = 8;
      // nums[2] = 3;
       //nums[3] = 9;

      // for(int i=0;i<nums.length;i++)
       //{
       // System.out.println(nums[i]);
       // }
}

}