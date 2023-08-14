import java.util.Scanner;
class Palindrome
{
	public static void main(String[]args)
	{
		Scanner scn=new Scanner(System.in);
		System.out.println("enter a number");
		int num=scn.nextInt();
		int rev=0;
		while(num>0)
		{
			int last=num%10;
			rev=rev*10+last;
			num=num/10;
		}
		if(num==rev)
			System.out.println(num +"is a palindrome number");
			else
			System.out.println(num +"is not a palindrome number");
		
	}
}