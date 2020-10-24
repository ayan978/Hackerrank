import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Grading_Students {
    
    public static List<Integer> gradingStudents(List<Integer> grades) {
    // Write your code here
    for(int i=0;i<grades.size();i++){
        if(grades.get(i)>=38){
           int five=5,count=8;
           while(grades.get(i)>= five){
               five=5;
               five *= count;
               count++;
           }
          
           if((five-grades.get(i))<3){
               grades.set(i,five);
           }
        }
    }
    return grades;

    }
    
    
    public static void main(String[] args) {
        
        Scanner s = new Scanner(System.in);
        
        int gradesCount = s.nextInt();
        
        List<Integer> grades = new ArrayList<>();
        
        for (int i = 0; i < gradesCount; i++) {
            int gradesItem = s.nextInt();
            grades.add(gradesItem);
        }
        
        List<Integer> result = gradingStudents(grades);
        
        for (int i = 0; i < result.size(); i++) {
            System.out.println(result.get(i));
        }

        
    }
    
}
