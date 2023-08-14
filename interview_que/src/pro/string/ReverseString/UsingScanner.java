package pro.string.ReverseString;
import java.util.*;
public class UsingScanner {
	public static void main(String[] args) {
		String org;
		String rev="";
		System.out.println("Enter string  to reverse");
		Scanner sc=new Scanner(System.in);
		org=sc.nextLine();
		int len=org.length();
		for(int i=len-1;i>=0;i--)
			rev=rev+org.charAt(i);
		System.out.println("original string is:"+org);
		System.out.println("Reverse of string is:"+rev);
	}

}
