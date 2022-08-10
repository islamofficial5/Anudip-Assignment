package arrayprograms;

public class TestArray
{
	public static int[] get()
	{
		int arr[]= {3,56,45,34};
		//return new int[] {10,20,30};
		return arr;
	}
	static void minElement(int arr[])
	{
		int min=arr[0];
		for(int i=1;i<arr.length;i++)
		{
			if(min>arr[i])
				min=arr[i];
		}
		System.out.println("min value: "+min);
	}
	public static void main(String[] args) 
	{
//		int a[]= {33,6,3,1,70};
//		minElement(a);	//passing array to method
		
		//passing anonymous array to method
		minElement(new int[] {33,6,3,1,70});
		
		int a[]=get();
		for(int var:a)
		{
			System.out.println(var);
		}
	}
}
