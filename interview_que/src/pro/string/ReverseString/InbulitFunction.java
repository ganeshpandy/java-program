package pro.string.ReverseString;

import java.util.*;
public class InbulitFunction{
	public static void main(String[]args){
		String original;
		System.out.println("Enter string to reverse");
		Scanner sc=new Scanner(System.in);
		original=sc.nextLine();
		StringBuffer sb=new StringBuffer(original);
		System.out.println(sb.reverse());
		}
}

