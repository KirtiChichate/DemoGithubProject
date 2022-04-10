package programs_10_3_22;

public class CountOccurrencesOfCharacterInString {

	public static void main(String[] args) {
		
		String SS= "I am Writing a Program";
		
		int total_count= SS.length();
		int total_count_afterRemove=SS.replace("a","").length();
		
		int count=total_count-total_count_afterRemove;
		
		System.out.println("Number occurrences of a is "+count);

	}

}
