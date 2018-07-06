class BubbleSort{
	public static void main(String []args)
	{
		int a[]={23,45,67,98,34};	
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<(a.length-1);j++)
			{
				if(a[j]>a[j+1])
				{
					int temp=a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
				}
			}

		}
		
		System.out.println("Sorted Array");


		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]);
		}
	}
}