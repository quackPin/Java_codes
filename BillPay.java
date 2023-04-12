import java.util.*;
public class BillPay {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Item one price: ");
        float num1 = sc.nextFloat();
        System.out.print("Item two price: ");
        float num2 = sc.nextFloat();
        float sum = num1 + num2;
        sc.close();
        System.out.println("Subtotal amount: "+sum);
        System.out.println("Additional 18% GST");
        float gst = sum * 18 /100;
        System.out.println("GST bill: "+gst);
        System.out.format("You have to pay: %.2f",gst);
    }
    
}
