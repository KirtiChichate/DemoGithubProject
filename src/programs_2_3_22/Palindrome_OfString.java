package programs_2_3_22;

import java.util.Scanner;

public class Palindrome_OfString {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the string");
		
		String STR= sc.next();
		String Org_STR=STR;
		
		String reverse="";
		
		int len=STR.length();
		
		for(int i=len-1; i>=0; i--)
		{
			reverse=reverse+STR.charAt(i);
		}
		
		if(Org_STR.equals(reverse))
		{
		
			System.out.println(Org_STR+" is a palindrome string");
		}
		else
		{
			System.out.println(Org_STR+" is not a palindrome string");
		}

	}

}
