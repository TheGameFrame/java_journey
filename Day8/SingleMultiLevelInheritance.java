package java_journey.Day8;
class Calc  //superclass/parent
{
    public int add(int n1, int n2)
    {
        return n1+n2;
    }

    public int sub(int n1, int n2)
    {
        return n1-n2;
    }

}
class AdvCalc extends Calc //inheritance/subclass/child
{ 
    public int multi(int n1, int n2)
    {
        return n1*n2;
    }

    public int divide(int n1, int n2)
    {
        return n1/n2;
    }
}

class VeryAdvCalc extends AdvCalc  //inheritance/subclass/grandchild
{
    public int mod(int n1, int n2)
    {
        return n1%n2;
    }

    public double power(int n1, int n2)
    {
        return Math.pow(n1,n2);
    }

}




public class SingleMultiLevelInheritance {
    public static void main(String a[]) 
    {
       VeryAdvCalc obj = new VeryAdvCalc();
       int r1 = obj.add(4, 5);
       int r2 = obj.sub(7, 3);
       int r3 = obj.multi(5, 3);
       int r4 = obj.divide(15, 3);
       int r5 = obj.mod(10, 3);
       double r6 = obj.power(4, 2);

       System.out.println(r1 + " " + r2 + " " + r3 + " " + r4 + " " + r5 + " " + r6);
    }
}

//I can build a calculator now in Java, what???

//Calc -> AdvCalc -> VeryAdvCalc - Multilevel Inheritance
//Calc -> AdvCalc - Single Inheritance