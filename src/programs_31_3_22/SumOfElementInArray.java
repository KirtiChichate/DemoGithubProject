package programs_31_3_22;

public class SumOfElementInArray {

	public static void main(String[] args) {
		
		int a[]= {1,2,3,4,5};
		int sum=0;
		
/*		for(int i=0; i<=a.length-1; i++)
		{
			sum=sum+a[i];
		}
		System.out.println("The Sum of Element in array is: "+sum);
*/		
		for(int value:a)
		{
			sum=sum+value;
		}
		System.out.println("The sum of Element i array is: "+sum);

	}

}
