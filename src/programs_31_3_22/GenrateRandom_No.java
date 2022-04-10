package programs_31_3_22;

import java.util.Random;

public class GenrateRandom_No {

	public static void main(String[] args) {
	
		Random Ran= new Random();
		int num= Ran.nextInt(10);
		System.out.println("The Random No from 0 to 10 is: "+num);
		
		double num1= Ran.nextDouble(5);
		System.out.println("The Random decimal No from 0 to 5 is: "+num1);
	
	}

}
