import java.util.*;


  public class Compare_the_Triplets{
    // Complete the compareTriplets function below.
    static List<Integer> compareTriplets(List<Integer> a, List<Integer> b) {
                int Alice=0,Bob=0;
                List<Integer> c = new ArrayList<>();
                for(int i=0;i<a.size();i++){
                    if(a.get(i)>b.get(i)){
                        Alice++;
                    }
                    else if(b.get(i)>a.get(i)){
                        Bob++;
                    }
                }
                c.add(Alice);
                c.add(Bob);

                return c;
                
    }
    
    public static void main(String[] args){
            Scanner s = new Scanner(System.in);
            List<Integer> a = new ArrayList<>();
            for (int i = 0; i < 3; i++) {
                int aItem = s.nextInt();
                a.add(aItem);
            }   
            List<Integer> b = new ArrayList<>();
            for (int i = 0; i < 3; i++) {
                int bItem = s.nextInt();
                b.add(bItem);
            }  
            List<Integer> result = compareTriplets(a, b);
            for(int i=0;i<result.size();i++){
            System.out.print(result.get(i)+" ");
            }
    }
   }
