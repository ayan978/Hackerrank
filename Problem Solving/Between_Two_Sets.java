public class Between_Two_Sets {
    
    public static int getTotalX(List<Integer> a, List<Integer> b) {
    // Write your code here
      List<Integer> temp = new ArrayList<>();
      int count,count1,result=0;
      for(int i=a.get(a.size()-1);i<=b.get(0);i++){
          count=0;
          for(int j:a){
              if(i%j==0){
                  count++;
              }
          }
          if(count==a.size()){
              temp.add(i);
          }
      }
      for(int i=0;i<temp.size();i++){
          count1=0;
          for(int j:b){
              if(j%temp.get(i)==0){
                  count1++;
              }
          }
          if(count1==b.size()){
              result++;
          }
      }
      return result;
    }
    
}
