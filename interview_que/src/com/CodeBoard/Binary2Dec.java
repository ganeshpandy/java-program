package com.CodeBoard;

public class Binary2Dec {
public static void main(String[] args) {
	int num = 1011;
	int temp = num;
	int dec_value = 0;
    int base = 1;
    while (temp > 0) {
        int rem = temp % 10;
        temp = temp / 10;
        dec_value += rem * base;
        base = base * 2;
    }
    System.out.println(dec_value);
	}
}
//String n="1010"; 
//System.out.println(Integer.parseInt(n,2));
