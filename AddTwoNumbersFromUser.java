
import java.util.Scanner;
public class AddTwoNumbersFromUser {

	public static void main(String[] args) {

		int num1, num2, sum;
		Scanner twoNum = new Scanner(System.in);
		System.out.print("Enter first number: ");
		num1 = twoNum.nextInt();
		System.out.print("Enter second number: ");
		num2 = twoNum.nextInt();

		twoNum.close();
		sum = num1 + num2;

		System.out.print("Sum of " + num1 + " & " + num2 + " is: " + sum);

	}

}