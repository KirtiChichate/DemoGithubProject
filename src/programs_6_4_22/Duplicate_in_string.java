package programs_6_4_22;

import java.util.Scanner;

public class Duplicate_in_string {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string to print its reverse");
		String str= sc.next();
		String rev = "";
		int len= str.length()-1;
		
		for(int i=len; i>=0; i--)
		{
			rev=rev+str.charAt(i);
		}
		
		System.out.println("reverse of String is: "+rev);
	}
}
