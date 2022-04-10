package programs_2_3_22;

import java.util.Scanner;

public class Count_No_Of_Digit {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the digit to count");
		
		int digit= sc.nextInt();
		int count=0;
		
		while(digit>0)
		{
			digit=digit/10;
			count++;
			
		}
		System.out.println("The count of this no. is "+count);

	}

}
