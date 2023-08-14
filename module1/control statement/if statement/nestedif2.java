class nestedif2
{
public static void main(String[]args)
{
	double accbal=10000.0;
	int amt=1500;
	if(amt%100==0)
	{
		if(amt%100==0)
		{
			System.out.println("withhdrawal success");
		}
		else
		{
			System.out.println("invalid amount pls enter in 100s");
		}
	}
	else
		{
			System.out.println("insufficient balance");
		}
}
}
