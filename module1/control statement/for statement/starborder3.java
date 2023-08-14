class starborder3
{
public static void main(String[]args)
{
int n=5;
for(int i=0;i<n;i++)
{
for(int j=0;j<n;j++)
{
	if(i==j||i+j==n-1)
System.out.print("*"+" ");
else
	System.out.print(" "+" ");
}
System.out.println();
}
}
}
	j=0	j=1	j=2	j=3	j=4
i=0
