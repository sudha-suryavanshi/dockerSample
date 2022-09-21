import java.math.BigDecimal;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

/*
 * Java's BigDecimal class can handle arbitrary-precision signed decimal numbers. Let's test your knowledge of them!
 * 
 * Sample Input

9
-100
50
0
56.6
90
0.12
.12
02.34
000.000

Sample Output

90
56.6
50
02.34
0.12
.12
0
000.000
-100
 */

public class BigDecimal_Demo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String s[] = new String[n + 2];
		for (int i = 0; i < n; i++) {
			System.out.println(s[i] = sc.next());

		}
		sc.close();
		Arrays.sort(s, new Comparator<String>() {

			@Override
			public int compare(String o1, String o2) {
				if (o1 == null || o2 == null) {
					return 0;
				}
				return new BigDecimal(o2).compareTo(new BigDecimal(o1));
			}

		});
		
		for(int i=0;i<n;i++) {
			System.out.println(s[i]);
		}

	}

}
