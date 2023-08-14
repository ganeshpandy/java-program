package com.exceptionHandling;

public class Program2 {
	public static void main(String[] args) {
		
		String str="null";
		try {
			System.out.println(str.charAt(2));
		}
		catch(NullPointerException e) {
			System.out.println("Operation With Null Reference");
			e.printStackTrace();
		}
		catch(StringIndexOutOfBoundsException e) {
			System.out.println("Invalid Index For Current String");
			e.printStackTrace();
		}
	}
}
