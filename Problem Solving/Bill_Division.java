import java.util.List;


public class Bill_Division {
    
    static void bonAppetit(List<Integer> bill, int k, int b) {
        
        int sum = 0;
        
        for(int i=0;i<bill.size();i++){
            
            if(i==k){
                continue;
            }
            sum += bill.get(i);
        }
        int perBill = sum/2;
        int rest = b - perBill;
        
        if(rest==0){
            System.out.println("Bon Appetit");
        }
        else{
            System.out.println(rest);
        }

    }
    
}
