class test3//decimaltobinary--->1to10
{
public static void main(String[]args)
{
	int num=1;
	while(num<=10)
	{
		int a=num;
		String bin="";
		while(a>0)
		{
			int rem=a%2;
			bin=rem+bin;
			a=a/2;
	}
	System.out.println("decimal:"+num+"binary:"+bin);
	num++;
}
}
}