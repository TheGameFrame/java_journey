package java_journey.Day8;

class Mobile 
{
    String brand;
    int price;
    String network;
    String name;

    public void show()
    {
        System.out.println("Brand: " + brand + ". Price: " + price + ". Network: " + network + ". Name: " + name);
    }
}
public class StaticVariable {
    public static void main(String a[]) 
    {
      Mobile obj = new Mobile();
      obj.brand = "Apple";
      obj.price = 1500;
      obj.name = "Smartphone";
      obj.network = "5G";

      Mobile obj1 = new Mobile();
      obj1.brand = "Samsung";
      obj1.price = 1200;
      obj1.name = "Smartphone";
      obj1.network = "4G";

      obj.show();
      obj1.show();

    }
    
}
