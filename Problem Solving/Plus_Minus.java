import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;
import java.util.Scanner;

public class Plus_Minus {

    // Complete the plusMinus function below.
    static void plusMinus(int[] arr) {
        double positive=0,negative=0,zero=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]<0){
                negative++;
            }
            else if(arr[i]>0){
                positive++;
            }
            else{
                zero++;
            }
        }
        System.out.printf("%.6f \n",positive/arr.length);
        System.out.printf("%.6f \n",negative/arr.length);
        System.out.printf("%.6f \n",zero/arr.length);

    }

    

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        

        int[] arr = new int[n];

        
        for (int i = 0; i < n; i++) {
            
            arr[i] = s.nextInt(); //arrItem;
        }

        plusMinus(arr);

        
    }
}
