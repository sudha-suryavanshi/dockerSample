import java.util.Scanner;

/*
 * If  or  , the output should be "java.lang.Exception: Breadth and height must be positive" without quotes.

Input Format

There are two lines of input. The first line contains : the breadth of the parallelogram. The next line contains : the height of the parallelogram.

Sample input 1

1
3
Sample output 1

3
Sample input 2

-1
2
Sample output 2

java.lang.Exception: Breadth and height must be positive

 */

public class StaticInitializer {

	static int B,H;
	static boolean flag = true;
	static{ //ONLY STATIC BLOCKS CAN ACCESS AND MODIFY STATIC VARIABLES.
	    Scanner sc = new Scanner(System.in);
	    B = sc.nextInt();
	    H = sc.nextInt();
	    if(B<=0 || H<=0)
	    {
	        flag = false;
	        System.out.println("java.lang.Exception: Breadth and height must be positive");
	    }
	 

	}
	public static void main(String[] args) {
		if(flag){
            int area=B*H;
            System.out.print(area);
        }
	}

}
