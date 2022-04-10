package programs_10_3_22;

public class RemoveJunk_SpecialCharsInString {

	public static void main(String[] args) {
		
		String s="@###%^&*()OIUYTVB#$% Its an New Day";
		
		String s1="Life #@$%^^*& is @#%^&% Beautiful +_)(*&^%$#@!";
		
		s=s.replaceAll("[^ a-zA-Z0-9]","");
		
		System.out.println(s);
		
		s1=s1.replaceAll("[^ a-zA-Z0-9]","");
		
		System.out.println(s1);

	}

}
