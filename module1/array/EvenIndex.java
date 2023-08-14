class EvenIndex
{
	public static void main(String[]args)
	{
		int[]num={13,11,15,12,16};
		int sum=0;
		
		for(int i=0;i<num.length;i++)
		{
		if(num[i]%2)
		sum=sum+num[i];
		}
		System.out.println("sum of even number is:"+sum);
	}
}