package com.stringExamples;

public class Program5 
{
	public static void main(String[] args) 
	{
		String str="A";
		StringBuffer buffer=new StringBuffer("A");
		StringBuilder builder=new StringBuilder("A");
		
		System.out.println(str.toString());
		System.out.println(buffer.toString());
		System.out.println(builder.toString());
		System.out.println(str.hashCode());
		System.out.println(buffer.hashCode());
		System.out.println(builder.hashCode());
	}
}
