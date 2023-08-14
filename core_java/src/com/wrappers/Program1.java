package com.wrappers;

public class Program1 {
	public static void main(String[] args) {
		int a=15;
		Integer ref=new Integer(a);//BOXING
		System.out.println(ref);
		
		double d=3.4;
		Double val=d;//BOXING(AUTO BOXING)
		System.out.println(val);
		
		char c='J';
		Character ch=c;//BOXING(AUTO BOXING)
		System.out.println(ch);
	}
}
//Note : Auto Boxing is only supported on JDK v1.5 and above
