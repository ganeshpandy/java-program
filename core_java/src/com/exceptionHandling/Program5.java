package com.exceptionHandling;

public class Program5 {
	static void test() {
		System.out.println("test starts");
		String s=null;
		System.out.println(s.charAt(3));
		System.out.println("test ends");
	}
	static void disp() {
		System.out.println("disp starts");
		test();
		System.out.println("disp ends");
	}
	public static void main(String[] args) {
		System.out.println("main starts");
		disp();
		System.out.println("main ends");
	}
}
