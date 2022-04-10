package progrms_24_2_22;

import java.util.Scanner;

public class factorialofno_usingDoWhile {

	public static void main(String[] args) {

      Scanner sc = new Scanner(System.in);
      
      System.out.println("Enter the no to find factorial");
	  int a= sc.nextInt();
	  
	
	  int fac=1; 
	  
	  int i=1;
	  do
	  {
		  fac= fac*i;
		  i++;
	  }
	  while(i<=a);
	  
	  System.out.println("The factorial of the no is "+fac);

	}

}
