class VicCipher{

	public static void main(String args[])
	{
		
		String pt="This is a String",ct="",et="";
		int key[]={1,2,3,4};
	

		for(int i=0;i<pt.length();i++)
		{
			int t=i%4;
			ct = ct + (char)(pt.charAt(i) + key[t]);
		}
	
		System.out.println(ct);
	
		for(int i=0;i<ct.length();i++)
		{
			int t=i%4;
			et = et + (char)(ct.charAt(i) - key[t]);
		}	
		
		System.out.println(et);
	}
}