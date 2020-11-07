import java.util.Scanner;


public class Cats_and_a_Mouse {
    
    static String catAndMouse(int x, int y, int z) {
          int xDistance = Math.abs(x-z);
          int yDistance = Math.abs(y-z);
          String result;
          if(xDistance<yDistance){
         result = "Cat A";
            }
          else if(yDistance<xDistance){
            result = "Cat B";
                 }
          else{
            result = "Mouse C";
          }
    return result;


    }
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int q = input.nextInt();
        
        for (int qItr = 0; qItr < q; qItr++) {
            

            int x = input.nextInt();

            int y = input.nextInt();

            int z = input.nextInt();

            String result = catAndMouse(x, y, z);

            System.out.println(result);
        }
    }
}
