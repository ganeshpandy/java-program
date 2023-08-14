class fibonacci//0,1,1,2,3
{
public static void main(String[]args)
{
int n=5;//5,4,3,2,1
int fib1=0;
int fib2=1;
int fib3=fib1+fib2;
while(n>0)
{
System.out.println(fib1);
fib1=fib2;
fib2=fib3;
fib3=fib1+fib2;
n--;
}
}
}
/*0+1=1
1+1=2
1+2=3
2+3=5
*/
