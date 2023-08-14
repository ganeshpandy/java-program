package com.stringExamples;

public class OneInput {
public static void main(String[] args) {
	OneInput oi=new OneInput();
	String name="hello";
	System.out.println(oi.call(name));
}
public String call(String name) {
	if(name.length()>=2) {
		return name.substring(0,2);
	}
	else {
		return name;
	}
}
}
