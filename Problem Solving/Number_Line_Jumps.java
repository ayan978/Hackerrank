import java.util.Scanner;


public class Number_Line_Jumps {
    

    static String kangaroo(int x1, int v1, int x2, int v2) {
           if(v1>v2){
           int remind = (x1-x2)%(v2-v1);

           if(remind==0){
               return "YES";
           }
       }
       return "NO";
}
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        int x1 = input.nextInt();
        int v1 = input.nextInt();
        int x2 = input.nextInt();
        int v2 = input.nextInt();
        
        String result = kangaroo(x1, v1, x2, v2);
        
        System.out.println(result);
      
    }
}
