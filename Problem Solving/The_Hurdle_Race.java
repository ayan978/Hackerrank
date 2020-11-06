import java.util.Scanner;


public class The_Hurdle_Race {
    
    static int hurdleRace(int k, int[] height) {
            int max = height[0];
            for(int i=0;i<height.length;i++){
                if(height[i]>max){
                    max = height[i];
                }
            }
            int dose;
            if(max<k){
                dose = 0;
            }
            else{
                dose = max - k;
            }
            
            return dose;

    }
    
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        int n = input.nextInt();

        int k = input.nextInt();

        int[] height = new int[n];
        
        for (int i = 0; i < n; i++) {
            height[i] = input.nextInt();
        }
        
       int result = hurdleRace(k, height);
        System.out.println(result);
    
}
}
