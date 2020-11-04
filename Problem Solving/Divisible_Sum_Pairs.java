mport java.util.Scanner;

public class Divisible_Sum_Pairs {
    
    static int divisibleSumPairs(int n, int k, int[] ar) {
         int count = 0;
         for(int i=0;i<ar.length-1;i++){
             for(int j=i+1;j<ar.length;j++){
                 if((ar[i]+ar[j])%k==0){
                     count++;
                 }
             }
         }
         return count;

    }
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        int n = input.nextInt();
        int k = input.nextInt();
        int[] ar = new int[n];
        
        for (int i = 0; i < n; i++) {
           ar[i] = input.nextInt();
        }
        
        int result = divisibleSumPairs(n, k, ar);
        System.out.println(result);
    }
    
}

