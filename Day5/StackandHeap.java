//This contains both Method Overloading AND Stack and Heap

package java_journey.Day5;

class Calculator2
{
    int num=5;
    public int add(int n1, int n2)
    {
        System.out.println(num);
        return n1 + n2;
        
    }
   

}

public class StackandHeap {
    public static void main (String[] args) 
    {
       Calculator2 obj = new Calculator2();
       Calculator2 obj1 = new Calculator2();
       //System.out.println(r1);

        obj.num=8;

       System.out.println(obj.num);
       System.out.println(obj1.num);
    }}