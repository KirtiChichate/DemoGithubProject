package programs_6_3_22;

public class Maxm_and_MinValuesInArray {

	public static void main(String[] args) {
		
		int a[]= {2,40,80,20,10,50,100,5};
//print max values from array		
		int max=a[0];
		
		for(int i=1; i<a.length; i++)
		{
			if(a[i]>max)
			{
				max=a[i];
			}
		}

		System.out.println("Maximum values in array is "+max);
		
		//print min values from array
		int min=a[0];
		
		for(int i=1; i<a.length; i++)
		{
			if(a[i]<min)
			{
				min=a[i];
			}
		}
		System.out.println("Minimum value in array is "+min);
	}

}
