class test2
{
public static void main(String[]args)
{
int n=5;
for(int i=0;i<n;i++)
{
for(int j=0;j<n;j++)
{
	if(i==n/2||j==n/2)
	{
		if(i%2==0)
		{
			if(j%2==0)
System.out.print(1+" ");
else
System.out.print(0+" ");	
		}
else 
{
	if(j%2==0)
		System.out.print(0+" ");
	else
		System.out.print(1+" ");
}
	}
else
{
	System.out.print(" "+" ");
}
}
System.out.println();
}
}
}
