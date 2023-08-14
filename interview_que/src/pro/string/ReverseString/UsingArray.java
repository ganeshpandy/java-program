package pro.string.ReverseString;
import java.util.*;
public class UsingArray {
	public static void main(String[] args) {
		String original;
		String rev="";
		System.out.println("Enter string  to reverse");
		Scanner sc=new Scanner(System.in);
		original=sc.nextLine();
		char a[]=original.toCharArray();
		int len=a.length;
		for(int i=len-1;i>0;i--)
		{
			rev=rev+a[i];
		}
		System.out.println("reverse string is:"+rev);
		}

}
