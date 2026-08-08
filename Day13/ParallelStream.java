package java_journey.Day13;
import java.util.*;

public class ParallelStream
{
    public static void main(String[] args) {

        int size = 10_000;
        List<Integer> nums = new ArrayList<>(size);

        Random ran = new Random();

        for(int i=1;i<=size;i++){
            nums.add(ran.nextInt(100));
        }

        long startSeq = System.currentTimeMillis();
        int sum2 = nums.stream()
                        .map(i -> {   //Millisecond delay
                        try{
                            Thread.sleep(1);
                        }
                        catch(Exception e){
                        }
                            return i*2;
                        })







                        .mapToInt(i -> i)
                        .sum();
                        
        long endSeq =  System.currentTimeMillis();

        long startPara = System.currentTimeMillis();
        int sum3 = nums.parallelStream()
                        .map(i -> {   //Millisecond delay
                        try{
                            Thread.sleep(1);
                        }
                        catch(Exception e){
                        }
                            return i*2;
                        })
                        .mapToInt(i -> i)
                        .sum();
        long endPara = System.currentTimeMillis();

        System.out.println(sum2 + " " + sum3);
        System.out.println("Seq : "+ (endSeq - startSeq));
        System.out.println("Para : "+ (endPara - startPara));
    }
}