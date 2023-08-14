class ifelseladder2//if_else if
{
public static void main(String[]args)
{
int age=6;
if(age<=3)
{
System.out.println("free ticket");
}
else if(age>3&&age<=10)
{
System.out.println("half ticket");
}
else if(age>10&&age<60)
{
System.out.println("full ticket");
}
else
{
	System.out.println("senior discount");
}
}
}