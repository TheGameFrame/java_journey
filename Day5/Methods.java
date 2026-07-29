package java_journey.Day5;

class Computer
{
    public void playMusic()
    {
        System.out.println("Music Playing...");
    }

    public String getmeApen(int cost)
    {
        if(cost>=10)
            return "You get a pen!";
        
            return "No pen for you today";
    }
}

public class Methods {
    public static void main (String[] args) 
    {
        Computer com = new Computer();
        com.playMusic();
        String str = com.getmeApen(10);
        System.out.println(str);

    }}