package progrms_24_2_22;

import java.util.Scanner;

public class LargestNoFrom2No {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Enter the 1st no to find");
		int a = sc.nextInt();
		System.out.println("Enter th 2nd no to find");
		int b= sc.nextInt();
		
		if(a>b)
		{
			System.out.println("A is the largest number");
		}
		else
		{
			System.out.println("B is the largest number");
		}

	}

}
