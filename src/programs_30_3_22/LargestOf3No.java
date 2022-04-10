package programs_30_3_22;

import java.util.Scanner;

public class LargestOf3No {

	public static void main(String[] args) {


		Scanner sc= new Scanner(System.in);

		System.out.println("Enter First number");
		int a=sc.nextInt();

		System.out.println("Enter second number");
		int b=sc.nextInt();

		System.out.println("Enter third number");
		int c=sc.nextInt();

		if(a>b && a>c)
		{
		  System.out.println("A is the largest no");
		}

		else if(b>a && b>c)
		{
		  System.out.println("B is the largest no");
		}

		else
		{
		  System.out.println("C is the largest no");
		}

	}

}
