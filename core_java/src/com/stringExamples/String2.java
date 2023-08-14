package com.stringExamples;

public class String2 {
public static void main(String[] args) {
	String a="<<>>";
	String b="hello";
	String2 s=new String2();
	System.out.println(s.makeAbba(a,b));
	}
public String makeAbba(String a,String b) {
	return a.substring(0,2)+ b +a.substring(3); 
}
}
