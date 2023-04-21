
import java.util.Scanner;

public class OddEvenCheck{

    public static void main(String[] args){
        int num;
        // Taking input from user
        Scanner scan = new Scanner(System.in);
        System.out.printf("Enter a number: ");
        num = scan.nextInt();
        scan.close();

        String result = (num%2 == 0)? "Even number" : "Odd number";
        System.out.println(num+" is an "+result);
    }
}
