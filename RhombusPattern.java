import java.util.*;
import java.util.Scanner;

public class RhombusPattern {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("** Your number should be grearter than 5 and also a even number! **");
        System.out.print("Enter your number: ");
        int num = sc.nextInt(); // num should be num > 5 and even number for better result
        sc.close();

        int n = num;
        int k = 0;
        int m = n-1;

        if(n > 5 && n%2 == 0 ){
            //loop start
            for(int i = 1; i <= n; i++){
                
                if(i <= n/2){
                    // first half 
                    // print upper triangle
                    for(int j = i; j <= n/2-1; j++){
                        System.out.print("  ");
                    }
                    for(int j = 1; j <= k+i ; j++){
                        System.out.print("* ");
                    }
                    System.out.println();   
                    k++;
                }else{
                    // second half
                    // print lower triangle
                    for(int j = 1; j < i - n/2; j++){
                        System.out.print("  ");
                    }
                    for(int j = 1; j <= m; j++){
                        System.out.print("* ");
                    }
                    System.out.println();   
                    m -=2;
                }
            }
        }else{
            System.out.println("***  Number should be grearter than 5 and also be a even number! ***");
        }
    }
    
}
