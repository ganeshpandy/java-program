package com.Array_concept;

public class Changeindex {
public static void main(String[] args) {
	int[]a= {1,2,3,4,5,6};
	int temp;
	System.out.println("Before changing");
	for(int i=0;i<a.length;i++) {
		System.out.print(a[i]+" ");
	}
	for(int i=0;i<a.length;i=i+2) {
		temp = a[i];//1,3
        a[i] = a[i+1];//2,
        a[i+1] = temp;//1,
		
}
	System.out.println();
	System.out.println("After changing");
	for(int i=0;i<a.length;i++) {
		System.out.print(a[i]+" ");
	}
	
}
}
