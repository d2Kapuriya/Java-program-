class CaesarCipher
{
	public static void main(String args[])
	{
		String pt=args[0],ct="",ft="";
		int key=Integer.parseInt(args[1]);


		for(int i=0;i<pt.length();i++)
		{
	
		 ct=ct+(char)(pt.charAt(i)+key);
		}

		
		
		System.out.println(ct);


		for(int i=0;i<ct.length();i++)
		{
	
		 ft=ft+(char)(ct.charAt(i)-key);
		}

		System.out.println(ft);
	}
}		