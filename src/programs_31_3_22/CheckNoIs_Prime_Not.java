package programs_31_3_22;

import java.util.Scanner;

public class CheckNoIs_Prime_Not {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the number");
		int num=sc.nextInt();
		int count=0;
		
		if(num>1)
		{
			for(int i=1; i<=num; i++)
			{
				if(num%i==0)
				count++;
				
			}
			if(count==2)
			{
				System.out.println("This no is prime number");
			}
			else
			{
				System.out.println("This is not a prime number");
			}
				
		}
		else
		{
			System.out.println("This is not a prime number");
		}
		

	}

}
