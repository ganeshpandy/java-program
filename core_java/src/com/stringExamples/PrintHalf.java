package com.stringExamples;
//this program is to print half the statement
public class PrintHalf {
public static void main(String[] args) {
	PrintHalf ph=new PrintHalf();
	String str="madam";
	System.out.println(ph.call(str));

	}
public String call(String str) {
	return str.substring(0,str.length()/2);
}
}
