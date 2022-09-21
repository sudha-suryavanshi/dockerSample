import java.io.BufferedReader;
import java.io.InputStreamReader;

/*
 * Sample Input
1
2
3
4
5
6

Sample Output
1+2=3
1+2+3=6
1+2+3+4+5=15
1+2+3+4+5+6=21
*/
 class Add{
	 static void add(int...numbers) {
		 int sum=0;
		 for(int num:numbers) {
			 if(sum!=0) {System.out.print("+");}
			 sum+=num;
			 System.out.print(num);
		 }
		 System.out.println("= "+sum);
	 }
 }

public class Vargs_Demo {

	public static void main(String [] args) {
		try {
			BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
			int n1=Integer.parseInt(br.readLine());
			int n2=Integer.parseInt(br.readLine());
			int n3=Integer.parseInt(br.readLine());
			int n4=Integer.parseInt(br.readLine());
			int n5=Integer.parseInt(br.readLine());
			int n6=Integer.parseInt(br.readLine());
			
			Add ob=new Add();
			ob.add(n1,n2);
			ob.add(n1,n2,n3);
			ob.add(n1,n2,n3,n4);
			ob.add(n1,n2,n3,n4,n5,n6);
		 }
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
	}
	 
}
