package programs_6_3_22;

public class Duplicate_Element_InArray {

	public static void main(String[] args) {
		
		String arr[]= {"Kirti", "Pawan", "Mangla", "Ramesh", "pawan", "pawan" };
		boolean status=false;  
		
		for(int i=0; i<arr.length; i++)
		{
			for(int j=i+1; j<arr.length; j++)
			{
				if(arr[i]==arr[j])
				{
					System.out.println("Duplicate element is array: "+arr[i]);
					status=true;
				}
			}
		}
		
		if(status==false)
		{
			System.out.println("Duplicate element is not found ");
		}

	}

}
