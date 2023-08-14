class ifelseladder3//if_else if
{
public static void main(String[]args)
{
char ch='G';
if(ch>='A'&&ch<='Z')
{
System.out.println("uppercase");
}
else if(ch>='a'&&ch<='z')
{
System.out.println("lowercase");
}
else if(ch>='0'&&ch<='9')
{
System.out.println("number");
}
else
{
	System.out.println("special character");
}
}
}