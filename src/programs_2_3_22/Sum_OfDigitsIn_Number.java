package programs_2_3_22;

import java.util.Scanner;

public class Sum_OfDigitsIn_Number {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the Number");		
		
		int num=sc.nextInt();
		int sum=0;
		
		while(num>0)
		{
			sum=sum+num%10;
			num=num/10;
			
		}
		System.out.println("Sum of the digits of this number is "+sum);

	}

}
