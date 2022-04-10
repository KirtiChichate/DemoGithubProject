package programs_4_3_22;

public class Sum_OfElementsIn_Array {

	public static void main(String[] args) {
		
		int a[]= {4,8,7,5,9};
		int sum=0;
		
		for(int i=0; i<=a.length-1; i++)
		{
			sum=sum+a[i];
		}
		System.out.println("Sum of array in element "+sum); 

		
/*		//by using Enhanced for loop
		for(int value:a)
		{
			sum=sum+value;
		}
		System.out.println("Sum of Array in element "+sum);    */
	}

}
