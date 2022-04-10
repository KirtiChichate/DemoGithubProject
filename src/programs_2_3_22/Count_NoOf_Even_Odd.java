package programs_2_3_22;

import java.util.Scanner;

public class Count_NoOf_Even_Odd {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the number to count even and odd");
		
		int num=sc.nextInt();
		
		int Even_no=0;
		int Odd_no=0;
		
		while(num>0)
		{
			int reminder=num%10;
			
		if(reminder%2==0)
		{
			Even_no++;
		}
		else
		{
			Odd_no++;
		}
		
		num=num/10;
		}
		
		System.out.println("The count of even number is "+Even_no);
		System.out.println("The count of odd number is "+Odd_no);
			

	}

}
