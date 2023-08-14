package com.stringExamples;

import java.util.Scanner;

public class ReturningValue {
public static void main(String[] args) {
//	Scanner sc=new Scanner(System.in);
//	String s=sc.next();
	String s="bob";
	ReturningValue s1=new ReturningValue();
System.out.println(s1.send(s));
	}

public String send(String s) {
	return "hello " + s + "!";
}


}


