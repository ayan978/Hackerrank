import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Migratory_Birds {
    
    static int migratoryBirds(List<Integer> arr) {
        int[] arr1 = new int[arr.size()];
        int maxType = arr.get(0); 
        int infoType=0;   
        for(int i=0;i<arr.size();i++){
            if((arr.get(i))>maxType){
                maxType = arr.get(i);
            }
        }
        int[] Hash = new int[maxType+1];
        for(int i=0;i<arr.size();i++){
            Hash[arr.get(i)]++;
        }
        int max = Hash[0];
        
        for(int i=0;i<Hash.length;i++){
             if(Hash[i]>max){
                 max = Hash[i];
                 infoType = i;
             }

        }
        return infoType;
    }

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        int arrCount = input.nextInt();
        List<Integer> arr = new ArrayList<>();

        for (int i = 0; i < arrCount; i++) {
            int arrItem = input.nextInt();
            arr.add(arrItem);
        }
        
        int result = migratoryBirds(arr);
        System.out.println(result);
             
    }
}
