import java.util.Scanner;


public class Angry_Professor {
    
    static String angryProfessor(int k, int[] a) {
            int count=0;
            for(int i=0;i<a.length;i++){
                if(a[i]<=0){
                    count++;
                }
            }
            if(count<k){
                return "YES";
            }
            else{
                return "NO";
            }

    }
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        int t = input.nextInt();
        
        for(int i=0;i<t;i++){
            
            int n = input.nextInt();
            int k = input.nextInt();
            
            int[] a = new int[n];
            
            for(int j=0;j<n;j++){
                a[j] = input.nextInt();
            }
            String result = angryProfessor(k,a);
            System.out.println(result);
        }
        
    }

    
}
