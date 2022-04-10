package programs_3_3_22;

import java.util.Random;

public class Generate_RandomNO {

	public static void main(String[] args) {
		
		Random ran= new Random();
		
		int Ran_int= ran.nextInt(10);
		System.out.println(Ran_int);

	}

}
