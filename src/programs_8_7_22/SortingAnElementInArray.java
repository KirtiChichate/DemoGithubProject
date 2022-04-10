package programs_8_7_22;

import java.util.Arrays;

public class SortingAnElementInArray {

	public static void main(String[] args) {
	
		int a[]= {10,5,100,20,80,40};
	System.out.println("Array before sorting "+Arrays.toString(a));
	
	int n=a.length;
	
	for(int i=0; i<n-1; i++) 
	{
		for(int j=0; j<n-1; j++)
		{
			if(a[j]>a[j+1])
			{
				int tem=a[j];
				a[j]=a[j+1];
				a[j+1]=tem;
				
			}
		}
	}
	
	System.out.println("Arrays after sorting "+Arrays.toString(a));

	}

}
