import java.io.*;
import java.util.*;

public class Simple_Array_Sum {

    /*
     * Complete the simpleArraySum function below.
     */
    static int simpleArraySum(int[] ar) {
        
        int sum = 0;
        for(int i=0;i<ar.length;i++){
            sum += ar[i];
        }
        return sum;

    }

    

    public static void main(String[] args) throws IOException{
        
        Scanner scanner = new Scanner(System.in);
        int arCount = scanner.nextInt();

        int[] ar = new int[arCount];

        String[] arItems = scanner.nextLine().split(" ");

        for (int i = 0; i < arCount; i++) {
            
            ar[i] = scanner.nextInt();
        }

        int result = simpleArraySum(ar);
        System.out.println(result);
        
    }
}
