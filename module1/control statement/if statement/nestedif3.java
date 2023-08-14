class nestedif3
{
public static void main(String[]args)
{
	char gender='M';
	int age=20;
	if(gender=='M')
	{
		if(age>=21)
		{
			System.out.println("eligible for marriage");
		}
		else
		{
			System.out.println("boy is underage");
		}
	}
	else if(gender=='F')
		{
			if(age>=18)
			{
				System.out.println("eligible for spinter");
			}
			else
			{
			System.out.println("girl is underage");
			}
		}
}
}
