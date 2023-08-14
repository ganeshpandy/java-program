class basepower1//3^4=3*3*3*3=81
{
public static void main(String[]args)
{
int base=3;
int power=4;
int result=1;
while(power>0)
{
result=result*base;
power--;
}
System.out.println(result);
}
}
