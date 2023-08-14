class decimaltobinary//101101
{
	public static void main(String[]args)
	{
		int num=45;
		String bin="";
		while(num>0)
		{
			int rem=num%2;
			bin=rem+bin;
			num=num/2;
		}
		System.out.println(bin);
	}
}