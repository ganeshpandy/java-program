package com.CodeBoard;

public class Compare2String {
public static void main(String[] args) {
	String s1="test12";
	String s2="1234";
	System.out.println(Compare(s1, s2));
}
public static int Compare(String s1,String s2) {
	for(int i=0;i<s1.length();i++) {
		for(int j=0;j<s2.length();j++) {
			if(s1.charAt(i)==s2.charAt(j)) {
				return i;
			}
		}
	}
	return -1;
}
}
