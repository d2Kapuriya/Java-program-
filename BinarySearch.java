/* WRT a java program  if key is apear in shorted array returns it's location number ,if not found
returns  -1, using binary search 

id no.17it043
*/

class BinarySearch{
	public static void main(String args[])
	{
		int a[]={3,6,8,11,24,56,98};
	        int l,r,mid,size,key=56;
		l=-1; 
		size=a.length;
		r=size;
		while(l+1!=r)
		{
		  mid=(l+r)/2;
		  if(a[mid]<=key)
		  {
			l=mid;
		   }
		  else r=mid;
		}

		if((l>=0)&&(a[l]==key))
			System.out.println("location of key \t"+(l));
		else	{System.out.println("key is not found \t"+(-1));}
	}
}  