import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

public class Birthday_Cake_Candles {

    /*
     * Complete the 'birthdayCakeCandles' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts INTEGER_ARRAY candles as parameter.
     */

    public static int birthdayCakeCandles(List<Integer> candles) {
                int max = candles.get(0),maxCount=0;
                for(int i:candles){
                    if(i>max){
                        max = i;
                    }
                }
                for(int i:candles){
                    if(i==max){
                        maxCount++;
                    }
                }
                return maxCount;

    }


    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int candlesCount = s.nextInt();

        List<Integer> candles = new ArrayList<>();

        for(int j=0;j<candlesCount;j++){
            int i = s.nextInt();
            candles.add(i);

        }

        int result = birthdayCakeCandles(candles);

        System.out.println(result);
    }
}
