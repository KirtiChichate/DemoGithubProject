package programs_6_3_22;

public class Missing_No_InArray {

	public static void main(String[] args) {
	
		int a[]= {5,6,7,9,10};
		
	//	int a[]= {1,2,3,5,6};
		
		int sum1=0;
		
		for(int i=0; i<a.length; i++)
		{
			sum1=sum1+a[i];
		}
		System.out.println("Sum of element in array "+sum1);

		int sum2=0;
		
		for(int i=5; i<=10; i++)
		{
			sum2=sum2+i;
		}
		System.out.println("Sum of element in array "+sum2);
		
		System.out.println("Missing no in array is "+(sum2-sum1));
	}

}
