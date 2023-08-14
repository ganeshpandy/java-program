class alphaa
{
public static void main(String[]args)
{
int n=5;
for(int i=0;i<n;i++)
{
for(int j=0;j<n;j++)
{
	if(i==0||j==0||i==n/2||j==n-1)
System.out.print("*"+" ");
else
	System.out.print(" "+" ");
}
System.out.println();
}
}
}
/*	j=0	j=1	j=2	j=3	j=4
i=0	*	*	*	*	*
i=1	*				*
i=2	*	*	*	*	*
i=3	*				*
i=4	*				*

*/