import java.util.Scanner;


public class Breaking_the_Records {
    
    static int[] breakingRecords(int[] scores) {
          int[] result = new int[2];
          int max=scores[0],min=scores[0],maxCount=0,minCount=0;
        
          for(int i=0;i<scores.length;i++){
              if(scores[i]>max){
                  max = scores[i];
                  maxCount++;
                  }
              if(scores[i]<min){
                  min = scores[i];
                  minCount++;
              }
          }

          result[0] = maxCount;
          result[1] = minCount;

          return result;
    }
    
    
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        int n = scanner.nextInt();
        int[] scores = new int[n];
        
        for (int i = 0; i < n; i++) {
             scores[i] = scanner.nextInt();
        }
        
        int[] result = breakingRecords(scores);
        
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i]+" ");
        }

    }
    
}
