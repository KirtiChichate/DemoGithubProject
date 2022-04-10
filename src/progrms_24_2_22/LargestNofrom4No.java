package progrms_24_2_22;

import java.util.Scanner;

public class LargestNofrom4No {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the 1st no to find");
		int a = sc.nextInt();
		
		System.out.println("Enter the 2nd no to find");
		int b = sc.nextInt();
		
		System.out.println("Enter the 3rd no to find");
		int c = sc.nextInt();
		
		System.out.println("Enter the 4th no to find ");
		int d = sc.nextInt();
		
		if(a>b && a>c && a>d)
		{
			System.out.println("A is the largest no");
		}
		else if(b>c && b>d)
		{
			System.out.println("B is the largest no");
		}
		else if(c>d)
		{
			System.out.println("C is the largest no");
		}
		else
		{
			System.out.println("D is the largest no ");
		}

	}

}
