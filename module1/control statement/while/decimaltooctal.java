class decimaltooctal//142
{
	public static void main(String[]args)
	{
		int num=98;
		String oct="";
		while(num>0)
		{
			int rem=num%8;
			oct=rem+oct;
			num=num/8;
		}
		System.out.println(oct);
	}
}