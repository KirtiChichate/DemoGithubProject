package programs_10_3_22;

import java.util.Scanner;

public class CountWordsInString {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the String to count words");
		
		String scr = sc.nextLine();
		int wrd=1;
		
		for(int i=0; i<=scr.length()-1; i++)
		{
			if((scr.charAt(i)==' ') && (scr.charAt(i+1)!=' '))
			{
				wrd++;
			}
		}
		System.out.println("Numbers of words in a string "+wrd);

	}

}
