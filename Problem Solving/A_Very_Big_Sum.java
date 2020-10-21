import java.util.*;

public class A_Very_Big_Sum {

    // Complete the aVeryBigSum function below.
    static long aVeryBigSum(long[] ar) {
            long sum = 0;
            for(int i=0;i<ar.length;i++){
                sum += ar[i];
            }
            return sum;

    }

    

    public static void main(String[] args){
        
       Scanner scanner = new Scanner(System.in);
        
        int arCount = scanner.nextInt();

        long[] ar = new long[arCount];
         
        for (int i = 0; i < arCount; i++) {           
            ar[i] = scanner.nextInt();
        }

        long result = aVeryBigSum(ar);

        System.out.println(result);
    }
}
