import java.util.*;

public class PalindromicNumberPyramid {
    
    public static void palindromicPattern(int num){

        // Start loop
        for(int i=1; i<=num; i++){

            // Loop for spaces
            for(int j=i; j<num ;j++){
                System.out.print(" ");
            }
            // first part
            for(int j=i;j>0;j--){
                System.out.print(j);
            }
            // second part
            for(int j=2;j<=i;j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        // taking user input
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter a number:");
        int num1 = sc.nextInt();

        // function calling
        if(num1<10 && num1>0){
            palindromicPattern(num1);
        }else{
            System.out.println("Enter number between 1-9");
        }
        
    }
}
