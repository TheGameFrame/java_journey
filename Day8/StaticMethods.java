package java_journey.Day8;

class Mobile 
{
    String brand;
    int price;
    String network;
    String name;

    public void show()
    {
        System.out.println(brand + " : " + price + " : " + network + " : " + name);
    }
    public static void show1(Mobile obj)
    {
        System.out.println(obj.brand + " : " + obj.price + " : " + obj.network + " : " + obj.name);
    }
}
public class StaticMethods {
    public static void main(String a[]) 
    {
      Mobile obj = new Mobile();
      obj.brand = "Apple";
      obj.price = 1500;
      obj.name = "Smartphone";

      Mobile obj1 = new Mobile();
      obj1.brand = "Samsung";
      obj1.price = 1200;
      obj1.name = "Smartphone";
      
      obj.show();
      obj1.show();

      Mobile.show1(obj1);

    }
    
}
