import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;


/*
 * A prime number is a natural number greater than  whose only positive divisors are  and itself. For example, 
 * the first six prime numbers are , , , , , and .
 * 
Sample Input

13

Sample Output

prime
 */




public class BigInteger_PrimeNumber_Demo {

	public static void main(String[] args) {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		try {
			String s=br.readLine();
			BigInteger bi=new BigInteger(s);
			System.out.println(bi.isProbablePrime(10)?"Prime":"Not prime");
			br.close();
			
			
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
