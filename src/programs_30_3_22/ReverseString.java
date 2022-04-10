package programs_30_3_22;

import java.util.Scanner;

public class ReverseString {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter the String");
		String str=sc.next();
		String rev="";

		int len=str.length();
		for(int i=len-1; i>=0; i--)
		{
		  rev=rev+str.charAt(i);
		}
		System.out.println("Enter the reverse String: "+rev);

	}

}
