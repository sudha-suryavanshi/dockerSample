import java.util.Scanner;
/*
 * Sample Input

He is a very very good boy, isn't he?

Sample Output

10
He
is
a
very
very
good
boy
isn
t
he
 */




public class StringToken_Demo {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
        String A=sc.nextLine();
        A=A.trim();
        if (A.isEmpty()) {
        	System.out.println(0);
        }
        else {
	        String []a = A.split("'+( +|)| +|!+( +|)|,+( +|)|_+( +|)|@+( +|)|\\.+( +|)|\\?+( +|)|\\\\+( +|)");
	        System.out.println(a.length);
		        for (int i = 0; i < a.length; i++) {        		
		        				System.out.println(a[i]);
		        }
        }        

	}

}
