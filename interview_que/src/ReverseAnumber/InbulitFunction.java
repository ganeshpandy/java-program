package ReverseAnumber;
import java.util.*;
public class InbulitFunction {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a number");
		int num=sc.nextInt();
	StringBuffer sb=new StringBuffer(String.valueOf(num));
	StringBuffer rev=sb.reverse();
	System.out.println("reverse number is:"+rev);
	}
}
