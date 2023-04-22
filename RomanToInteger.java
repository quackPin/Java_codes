
import java.util.*;
public class RomanToInteger {
    public static int romanToInt(String s){

        int answer = 0, number = 0, prev = 0;

        // starting loop for given charcter
        for(int i = s.length()-1; i>=0; i--){

            // adding individual value
            switch(s.charAt(i)){
                case 'I': number = 1;
                break;
                case 'V': number = 5;
                break;
                case 'X': number = 10;
                break;
                case 'L': number = 50;
                break;
                case 'C': number = 100;
                break;
                case 'D': number = 500;
                break;
                case 'M': number = 1000;
                break;
            }
            if(number < prev){
                answer -= number; 
                // IV = 4 not 1+5 = 6 so we have to subtruct numbers if left side number is smaller than right side number! 
                // like, for IV -> I = 1, V = 5 so 1 < 5 ... thats why we sustruct 5-1 = 4 so IV = 4.
            }else{
                answer += number;
            }
            prev = number;
        }
        return answer;

    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please Enter Any Roman Number: ");
        String num = sc.nextLine();

        System.out.println(num+"-> "+romanToInt(num)); // function calling
        
        sc.close();
    }
}
