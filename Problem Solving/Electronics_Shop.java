import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Electronics_Shop {
    
    /*
     * Complete the getMoneySpent function below.
     */
    static int getMoneySpent(int[] keyboards, int[] drives, int b) {
        /*
         * Write your code here.
         */
         List<Integer> l = new ArrayList<>();
         int count = 0;
         for(int i=0;i<keyboards.length;i++){
             for(int j=0;j<drives.length;j++){
                 if((keyboards[i]+drives[j])<=b){
                     l.add(keyboards[i]+drives[j]);
                     count++;
                 }
                 
             }
         }
         if(count!=0){
         int most = l.get(0);
         for(int i=0;i<l.size();i++){
             if(l.get(i)>most){
                 most = l.get(i);
             }
         }
         return most;
         }
         else{
              return -1;
         }



    }
    
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        int b = input.nextInt();
        int n = input.nextInt();
        int m = input.nextInt();
        
        int[] keyboards = new int[n];
        
        for(int i=0;i<n;i++){
            keyboards[i] = input.nextInt();
        }
        
        int[] drives = new int[m];
        
        for (int j=0;j<m;j++) {
            
            drives[j] = input.nextInt();
        }
      
        int moneySpent = getMoneySpent(keyboards, drives, b);
        System.out.println(moneySpent);

    }
    
}
