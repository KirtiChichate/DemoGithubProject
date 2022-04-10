package programs_6_3_22;

public class Searching_ElementIn_Array {

	public static void main(String[] args) {
		
		int a[]= {10,20,30,80,54};
		
		int Search_ele=80;
		boolean status=false;
		
		for (int i=0; i<a.length; i++)
		{
			if(Search_ele==a[i])
			{
				System.out.println("Element found at "+i);
				status=true;
				break;
			}
		}
		
		if(status=false)
		{
			System.out.println("Element is not found");
		}

	}

}
