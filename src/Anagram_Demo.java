import java.util.Arrays;
import java.util.Scanner;

public class Anagram_Demo {

	public static boolean isAnagram(String a,String b) {
		if(a.length()!=b.length()) {
			return false;
		}
		else {
			char str1array[]=a.toCharArray();
			char str2array[]=b.toCharArray();
			
			Arrays.sort(str1array);
			Arrays.sort(str2array);
			
			return Arrays.equals(str1array,str2array);
			
		}
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String a=sc.nextLine();
		String b=sc.nextLine();
		
		a=a.replaceAll("\\s","").toLowerCase();
		b=b.replaceAll("\\s","").toLowerCase();
		
		if(isAnagram(a,b))
		{
			System.out.println("String :" + a +" and "+ b +" are anagram");
		}
		else {
			System.out.println("String :" + a +" and "+ b +" are not anagram");
		}
	}

}
