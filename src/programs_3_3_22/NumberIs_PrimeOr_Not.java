package programs_3_3_22;

import java.util.Scanner;

public class NumberIs_PrimeOr_Not {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter a number");
		int num=sc.nextInt();
		int count=0;
		
		//natural no >1
		//its having only tow factorial i.e 1 and itself that no
		if(num>1)
		{
			for(int i=1; i<=num; i++)
			{
				if(num%i ==0)
				{
				count++;
				}
			}
			if(count== 2)
			{
				System.out.println("This is prime number");
			}
			else
			{
				System.out.println("This is not prime number");
			}
			
		}
		else
		{
			System.out.println("The given is not a prime number");
		}

	}

}
