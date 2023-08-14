class starborder1
{
public static void main(String[]args)
{
int n=5;
for(int i=0;i<n;i++)//responsible for no of rows
{
for(int j=0;j<n;j++)//responsible for no of column
{
	if(i==0||j==0||i==n-1||j==n-1)
System.out.print("*"+" ");
else
	System.out.print(" "+" ");
}
System.out.println();//move the print cursor to next line
}
}
}
