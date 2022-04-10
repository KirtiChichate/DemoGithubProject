package programs_8_7_22;

public class SearchingAnElemmentInArray {

	public static void main(String[] args) {
	
		int a[]= {50,80,10,40,90,20};
		boolean status=false;
		int key=50;
		int l=0;
		int h=a.length-1;
		
		while(l<=h)
		{
			int m=(l+h)/2;
			if (a[m]==key)
			{
				System.out.println("ELement found");
				status=true;
				break;
				
			}
			
			if(a[m]<key)
			{
				l=m+1;
			}
			if(a[m]>key)
			{
				l=m-1;
			}
		}
		
		if(status==false)
		{
			System.out.println("Element is not found");
		}
	}

}
