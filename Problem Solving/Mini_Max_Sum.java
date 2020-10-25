import java.util.*;

public class Mini_Max_Sum {

    // Complete the miniMaxSum function below.
    static void miniMaxSum(int[] arr) {
     
        Arrays.sort(arr);
        long sum = 0;
        
        for(int i=0;i<arr.length;i++){
            sum += arr[i];
        }
        
        System.out.println((sum-arr[4])+" "+(sum-arr[0]));      
        
    }
    
    

    
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        int[] arr = new int[5];
        
        for (int i = 0; i < 5; i++) {
            arr[i] = scanner.nextInt();
        }

        miniMaxSum(arr);

    }
}
