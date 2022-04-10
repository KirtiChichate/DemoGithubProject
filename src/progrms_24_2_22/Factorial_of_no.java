package progrms_24_2_22;

import java.util.Scanner;

public class Factorial_of_no {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the no to find Factorial");
		int a = sc.nextInt();
		 
		int fac = 1;
		for(int i=1; i<=a; i++)
		{
			fac= fac*i;
			
		}
		System.out.println("Factorial is "+fac);

	}

}
