package java_journey.Day9;

class Laptop
{
    String model;
    int price;


    public String toString() 
    {
        return "Laptop [model=" + model + ", price=" + price + "]";
    }


    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((model == null) ? 0 : model.hashCode());
        result = prime * result + price;
        return result;
    }


        public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Laptop other = (Laptop) obj;
        if (model == null) {
            if (other.model != null)
                return false;
        } else if (!model.equals(other.model))
            return false;
        if (price != other.price)
            return false;
        return true;
    }


    

}
public class ObjectClassToHashcode {
    
    
    public static void main(String a[])
    {
        Laptop obj1 = new Laptop();
        obj1.model = "Lenovo Thinkpad Gen 1 T14";
        obj1.price = 300;

        Laptop obj2 = new Laptop();
        obj2.model = "Acer Aspire 3 15";
        obj2.price = 400;

        boolean result = obj1.equals(obj2);

        System.out.println(result);
        

    }

}