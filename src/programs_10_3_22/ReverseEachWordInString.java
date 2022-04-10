package programs_10_3_22;

public class ReverseEachWordInString {

	public static void main(String[] args) {
		
		String str="Today is thursday";
		String[] words=str.split(" ");
		String RevStr=" ";
		
		for(String wrd:words)
		{
			String reverseword=" ";
			for(int i=wrd.length()-1; i>=0; i--)
			{
				reverseword=reverseword+wrd.charAt(i);
			}
			
			RevStr=RevStr+reverseword;
		}
		
		System.out.println(RevStr);

	}

}
