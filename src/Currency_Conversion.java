import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

/*
 * Sample Input
 *
 * 12324.134
 * 
 * Sample Output
 *
 * US: $12,324.13
 * India: Rs.12,324.13
 * China: ￥12,324.13
 * France: 12 324,13 €
 * Explanation
 *
 * Each line contains the value of  formatted according to the four countries' respective currencies.
 */
 

public class Currency_Conversion {

	public static void main(String[] args) {
		
     Scanner sc=new Scanner(System.in);
     double payment=sc.nextDouble();
     
     String us=NumberFormat.getCurrencyInstance(Locale.US).format(payment);
     String india=NumberFormat.getCurrencyInstance(new Locale("en","IN")).format(payment);
     String china=NumberFormat.getCurrencyInstance(Locale.CHINA).format(payment);
     String france=NumberFormat.getCurrencyInstance(Locale.FRANCE).format(payment);
     
     System.out.println("US:"+us);
     System.out.println("INDIA:"+india);
     System.out.println("CHINA:"+china);
     System.out.println("FRANCE:"+france);
	}

}
