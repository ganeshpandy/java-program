class factorialusingmethod
{
static int factorial(int num)
{					
int n=num;
int fact=1;
while(n>0)
{
	
fact=fact*n;
n--;
}
return fact;
}
public static void main(String[] args)
{
for(int i=1;i<=10;i++)
{
int res=factorial(i);
System.out.println(i+"factorial is:"+res);
}
}
}