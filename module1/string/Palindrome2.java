import java.util.Scanner;
class Palindrome2
{
	public static void main(String[]args)
	{
		Scanner scn=new Scanner(System.in);
		System.out.println("enter the name");
	String str="";
	str=str.toUpperCase();
	boolean flag=true;
	for(int i=0;i<=str.length()/2;i++)
	{
		if(str.charAt(i)!=str.charAt(str.length()-1))
		{
			if(str.charAt(i)!=str.charAt(str.length()-1-i))
			{
				flag=false;
				break;
			}
		}
		String res=flag==true?"palindrome":"not palindrome";
		System.out.println(res);
	}
	}
}