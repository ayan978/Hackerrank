import java.util.*;

public class Staircase {

    // Complete the staircase function below.
    static void staircase(int n) {
           for(int i=0;i<n;i++){
              for(int j=0;j<((n-i)-1);j++){
                  System.out.print(" ");
              }
              for(int k=0;k<=i;k++){
                  System.out.print("#");
              }
              System.out.println();
          }


    }

   
    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        

        staircase(n);
    }
}

