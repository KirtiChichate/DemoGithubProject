package programs_1_3_22;

import java.util.Scanner;

public class Swapping_Of_TwoNumbers {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the first number");
		int a=sc.nextInt();
		
		System.out.println("Enter the second number");
		int b=sc.nextInt();
		
	    a=a+b;
		b=a-b;
		a=a-b;
		
		System.out.println("After swapping this two numbers are :"+a+" "+b);
		
		
				
				

	}

}
