public class Viral_Advertising {
    
     static int viralAdvertising(int n) {
         int shared = 5,cumulative=0,liked;
         
         for(int i=1;i<=n;i++){
             liked = shared/2;
             cumulative += liked;
             shared = liked*3;
         }
         
         return cumulative;

    }
    
}
