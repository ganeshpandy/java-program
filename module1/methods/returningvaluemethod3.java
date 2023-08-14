class returningvaluemethod3
{
public static void main(String[]args)
{
boolean b=check(20);
System.out.println("status:"+b);
}
static boolean check(int num)
{
if(num%2==0)
return true;
else
return false;
}
}
