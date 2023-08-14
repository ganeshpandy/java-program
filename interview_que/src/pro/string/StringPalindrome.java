package pro.string;
import java.util.*;

public class StringPalindrome {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a string value");
		String s=sc.nextLine();//dad
		String orgStr=s;//dad
		String rev="";//dad
		int len=s.length();
		for(int i=len-1;i>=0;i--)
		{
			rev=rev+s.charAt(i);
		}
		if(orgStr.equals(rev))
		{
		System.out.println(orgStr+"is a palindrome");	
		}
		else
		{
			System.out.println(orgStr+"Not a palindrome String");
		}
	}

}
