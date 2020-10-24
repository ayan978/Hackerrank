import java.util.Scanner;


public class Apple_and_Orange {
    
    static void countApplesAndOranges(int s, int t, int a, int b, int[] apples, int[] oranges) {
      int apple = 0,orange=0;
      for(int i=0;i<apples.length;i++){
          if(((a+apples[i])>=s) && ((a+apples[i])<=t)){
              apple++;
          }
      }
      for(int i=0;i<oranges.length;i++){
          if(((b+oranges[i])>=s) && ((b+oranges[i])<=t)){
              orange++;
          }
      }

      System.out.println(apple);
      System.out.println(orange);
    }
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int s = input.nextInt();

        int t = input.nextInt();    
        int a = input.nextInt();
        int b = input.nextInt();  
        int m = input.nextInt();
        int n = input.nextInt();
        int[] apples = new int[m];
        
        for (int i = 0; i < m; i++) {
            apples[i] = input.nextInt();
        }
        
        int[] oranges = new int[n];
        
        for (int i = 0; i < n; i++) {
            oranges[i] = input.nextInt();
        }
        
        countApplesAndOranges(s, t, a, b, apples, oranges);

    }
    
    
    
}
