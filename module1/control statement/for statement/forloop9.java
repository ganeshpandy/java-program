class forloop9
{
public static void main(String[]args)
{
int n=5;
int a=1;//2,3,2,1
for(int i=0;i<n;i++)
{
	System.out.print(a+" ");
if(i<n/2)
{
a++;
}
else
{
a--;
}
}
}
}