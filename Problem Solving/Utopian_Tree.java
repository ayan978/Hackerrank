public class Utopian_Tree {
    
    static int utopianTree(int n) {
          int start = 1;
          for(int i=1;i<=n;i++){
              if(i%2==0){
                  start+=1;
              }
              else{
                  start*=2;
              }
          }
          return start;

    }
    
}
