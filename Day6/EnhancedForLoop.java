package java_journey.Day6;
class Student
{
    int rollno;
    String name;
    int marks;
}

public class EnhancedForLoop {
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

    for(Student stud: students)  //faster way of doing this, same results
    {
        System.out.println(stud.name + " : " + stud.marks);
    }
    }

}