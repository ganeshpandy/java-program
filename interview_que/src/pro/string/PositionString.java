package pro.string;

import java.util.Scanner;

public class PositionString {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter input string");
	String str=sc.nextLine();
	for(int i=0;i<str.length();i++) {
		System.out.println("A letter "+str.charAt(i)+" "+"is in the position "+i);
				}
		}
}
