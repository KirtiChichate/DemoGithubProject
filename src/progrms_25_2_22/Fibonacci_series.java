package progrms_25_2_22;

import java.util.Scanner;

public class Fibonacci_series {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter a one no till i want to print fibonacci series");
		int a = sc.nextInt();
		
		
		int sum=0;
		int s1=1;
		int s2=0;
		
		for(int i=1; i<=a; i++)
		{
			sum=s1+s2;
			System.out.println(sum);
			
			s2=s1;
			s1=sum;
			
		}
		
		
	}

}
