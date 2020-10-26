import java.util.*;

public class Time_Conversion {
    
   static String timeConversion(String s) {
       int x;
       String s1="",s2="",s3="";
       if(s.contains("AM")){
           if((s.charAt(0)=='1') && (s.charAt(1)=='2')){             
               s1 += s.charAt(0);
               s1 += s.charAt(1);
               x = Integer.parseInt(s1);
               x -= 12;
               s2 = Integer.toString(x) + '0';
               for(int i=2;i<s.length()-2;i++){
               s2 += s.charAt(i);
               
           }
           
           
           }
           else{
              for(int i=0;i<s.length()-2;i++){
                  s2 += s.charAt(i);
              } 
           }
       }
       
       else if(s.contains("PM")){
           
           if(s.charAt(0)=='1' && s.charAt(1)=='2'){
               for(int i=0;i<s.length()-2;i++){
                   s2 += s.charAt(i);
               }
           }
           else{
              s1 += s.charAt(0);
              s1 += s.charAt(1);
              x = Integer.parseInt(s1);
              x += 12;
              s2 = Integer.toString(x);
              for(int i=2;i<s.length()-2;i++){
              s2 += s.charAt(i);
           }     
           }
           
       }
       
       return s2; 
    }

    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        String s = input.nextLine();
        String result = timeConversion(s);
        
        System.out.println(result);
        
    }
    
}
