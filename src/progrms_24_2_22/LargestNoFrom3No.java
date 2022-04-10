package progrms_24_2_22;

import java.util.Scanner;

public class LargestNoFrom3No {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the 1st No to find");
		int a= sc.nextInt();
		
		System.out.println("Enter the 2nd No to find");
		int b= sc.nextInt();
		
		System.out.println("Enter the 3rd No to find");
		int c= sc.nextInt();
		
		if(a>b && a>c)
		{
			System.out.println("A is the largest no");
		}
		else if(b>c)
		{
			System.out.println("B is the largest no");
		}
		else
		{
			System.out.println("C is the largest no");
		}

	}

}
