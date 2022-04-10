package programs_31_3_22;

import java.util.Scanner;

public class Factorial_Of_Number {

	public static void main(String[] args) {
		
	Scanner sc= new Scanner(System.in);
	System.out.println("Enter a Number");
	int num=sc.nextInt();
	int Factorial=1;

	//This will print in Ascending order
	for(int i=1; i<=num; i++)
	{
		Factorial=Factorial*i;
		
	}
	System.out.println("Factorial of a number is: "+Factorial);
//This will print in desending order
/*	for(int i=num; i>=1; i--)
	{
		Factorial=Factorial*i;
		
	}
	System.out.println("Factorial of a number is: "+Factorial);
*/
	}

}
