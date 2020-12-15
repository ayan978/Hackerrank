public class Counting_Valleys {
    
    
    public static int countingValleys(int steps, String path) {
            int count=0,valleyVisit=0;
            for(int i=0;i<path.length();i++){
                if(path.charAt(i)=='U'){
                    count++;
                }
                else{
                count--;
                }
                if(count==0 && path.charAt(i)=='U'){
                    valleyVisit+=1;
                }
                
            }
            
            return valleyVisit;

    }
    
}
