public class Gcd
{
	public static void main(String args[])
	{
		int a[]={12,45,67,89,90},q;
		int r,r1,r2,r3,gcd;

		r1=a[0];

	
		for(int i=0;i<4;i++)
		{
			
			r2=a[i+1];
			while(r2>0)
			{
				q=r1/r2;
				r=r1%r2;
				r1=r2;
				r2=r;
			}	
		}

		System.out.println("Gcd ="+r1);	
	}
}