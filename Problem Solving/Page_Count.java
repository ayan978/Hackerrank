public class Page_Count {
    
    static int pageCount(int n, int p) {
        
        int count1=0,count2=0;
        
        for(int i=1;i<=n;i+=2){
            if(p==i || p==i-1){
                break;
            }
            count1++;
        }
        for(int i=n;i>=0;i=i-2){
            if(n%2==0){
            if(p==i || p==i+1){
                break;
            }
            }
            else{
                if(p==i || p==i-1){
                    break;
                }
            }
            count2++;
        }
        
        if(count1<count2){
            return count1;
        }
        else{
            return count2;
        }

    }
    
}
