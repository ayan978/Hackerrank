import java.util.ArrayList;
import java.util.List;

public class Sales_by_Match {
    
    static int sockMerchant(int n, int[] ar) {
          int max=ar[0],min=ar[0];
          List<Integer> l = new ArrayList<>();
          for(int i=0;i<n;i++){
              if(ar[i]>max){
                  max = ar[i];
              }
              if(ar[i]<min){
                  min = ar[i];
              }
          }
          for(int i=min;i<=max;i++){
              int num=0,pair=0;
              for(int j=0;j<n;j++){
                  if(ar[j]==i){
                      num++;
                  }
              }
              pair = num/2;
              l.add(pair);
          }
          int sum = 0;
          for(int i=0;i<l.size();i++){
              sum += l.get(i);
          }
          return sum;

    }
    
}
