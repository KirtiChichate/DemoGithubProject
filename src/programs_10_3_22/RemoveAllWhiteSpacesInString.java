package programs_10_3_22;

import java.util.Scanner;

public class RemoveAllWhiteSpacesInString {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the string");
		
		String Str= sc.nextLine();
		System.out.println("Before Removing the WhiteSpaces:"+Str);
		
		String Strng = Str.replaceAll("\\s","");
		System.out.println("After removing the Whitespaces:"+Strng);

	}

}
