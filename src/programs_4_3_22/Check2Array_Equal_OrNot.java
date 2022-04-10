package programs_4_3_22;

import java.util.Arrays;

public class Check2Array_Equal_OrNot {

	public static void main(String[] args) {
		
		int a1[]= {1,2,3,4,5,6};
		int a2[]= {1,2,3,4,5,6};
		
		boolean status = Arrays.equals(a1, a2);

//This is the 1st Logic 
	/*	if(status==true)
		{
			System.out.println("This two arrays is Equal");
		}
		else
		{
			System.out.println("This two array is not Equal");
		}
*/
//This is the 2nd Logic 
		if(a1.length==a2.length)
		{
			for(int i=0; i<a1.length;i++)
			{
				if(a1[i]!=a2[i])
				{
				status=false;
				}
			}
			
		}
		else
		{
			status=false;
		} 
		
		if(status==true)
		{
			System.out.println("This two Arrays are Equal");
		}
		else
		{
			System.out.println("This two arrays are NOT equal");
		}  
	}

}
