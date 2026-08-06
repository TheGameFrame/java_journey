enum LaptopTypes
{
    Macbook(2000), XPS(2200), Surface, ThinkPad(1800);

    private int price;

    private LaptopTypes()
    {
        price = 1000;
    }

    private LaptopTypes(int price) {
        this.price = price;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    
    
}

public class EnumClass{
    public static void main(String a[])
    {
            
           for(LaptopTypes lap : LaptopTypes.values())
            {
                System.out.println(lap + " : " + lap.getPrice());
            }
        

    }
}