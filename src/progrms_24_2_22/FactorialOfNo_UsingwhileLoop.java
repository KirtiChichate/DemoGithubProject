package progrms_24_2_22;

import java.util.Scanner;

public class FactorialOfNo_UsingwhileLoop {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the no to find factorial");
		int a= sc.nextInt();
		
		int fac=1;
		int i=1;
		while(i<=a)
		{
			fac=fac*i;
			i++;		
		}
		
		System.out.println("factorial of the no is "+fac);

	}

}
