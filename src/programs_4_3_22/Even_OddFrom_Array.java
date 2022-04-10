package programs_4_3_22;

public class Even_OddFrom_Array {

	public static void main(String[] args) {
		
		int a[]= {1,2,5,4,8,7,9};
		
/*		System.out.println("Even number in this array is....");
		for(int i=0; i<a.length; i++)
		{
			if(a[i]%2==0)
			System.out.println(a[i]);
		}
		
		System.out.println("Odd number in this array is....");
		for(int i=0; i<a.length; i++)
		{
			if(a[i]%2!=0)
				System.out.println(a[i]);
		}  */
		
// using Enhanced for loop
		System.out.println("Even number in this array is....");
		for(int value:a)
		{
			if(value%2==0)
			{
				System.out.println(value);
			}
		}
		
	
		System.out.println("Odd number in this array is....");
		for(int value:a)
		{
			if(value%2!=0)
				System.out.println(value);
		}
		
	}

}
