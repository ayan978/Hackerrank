public class Beautiful_Days_at_the_Movies {
    
     static int beautifulDays(int i, int j, int k) {
           int count = 0;
           for(int x=i;x<=j;x++){
               String s = Integer.toString(x),s1="";
               for(int x1=s.length()-1;x1>=0;x1--){
                    s1+=s.charAt(x1);
                   
               }
               int x2 = Integer.parseInt(s1);
               int result = Math.abs(x-x2);
               if(result%k==0){
                   count++;
               }
           }
           return count;
     }
    
}
