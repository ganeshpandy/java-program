package pro.NumberSystem;

import java.util.Scanner;
class Palindrome{
	public static void main(String[]args)
	{
		Scanner scn=new Scanner(System.in);
		System.out.println("enter a number");
		int num=scn.nextInt();//121
		int org=num;//121
		int rev=0;
		while(num>0)//1
		{
			int last=num%10;//1
			rev=rev*10+last;//121
			num=num/10;//0
		}
		if(org==rev)
			System.out.println(rev +" is a palindrome number");
			else
			System.out.println(rev +"is not a palindrome number");
		
	}
}