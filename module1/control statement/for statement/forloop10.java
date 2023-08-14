class forloop10
{
public static void main(String[]args)
{
int n=5;
char ch='a';
for(int i=0;i<n;i++)
{
if(i%2==0)
{
System.out.print(ch+" ");
ch++;
}
else
{
	System.out.print("*"+" ");
}
}
}
}