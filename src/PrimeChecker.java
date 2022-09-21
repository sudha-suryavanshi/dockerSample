import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Prime{

	public void checkPrime(int...arguments) {

   for(int num:arguments) {
	   if(isPrime(num))
	   System.out.print(num+"");
   }
		System.out.println();
	}
	
	private boolean isPrime(int num) {
		if(num==1)return false;
		for(int i=2;i<num;i++) {
			if(num%i==0)return false;
		}
		return true;
	}
	
}

public class PrimeChecker {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int n1=Integer.parseInt(br.readLine());
		int n2=Integer.parseInt(br.readLine());
		int n3=Integer.parseInt(br.readLine());
		int n4=Integer.parseInt(br.readLine());
		int n5=Integer.parseInt(br.readLine());
		
		Prime ob=new Prime();
		ob.checkPrime(n1);
		ob.checkPrime(n1,n2);
		ob.checkPrime(n1,n2,n3);
		ob.checkPrime(n1,n2,n3,n4,n5);
		

	}

}
