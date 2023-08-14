package com.CodeBoard;

public class Decimal2binary {
public static void main(String[] args) {
	int n=10;
	int copy=n;
	String bin="";
	while(n>0) {
		int rem=n%2;
		bin=rem+bin;
		n=n/2;
	}
	System.out.println("decimal:"+copy + " binary:"+bin);
	n++;

	}

}
