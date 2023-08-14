package com.CodeBoard;
public class ChangeOddIndex {
public static void main(String[] args) {
	int[] a= {1,5,7,8,3,2};
	for(int i=a.length-1;i>=0;i--) {
		if(i%2==0 && i!=0) {
			a[i]=a[i-1]+a[i-2];	
		}
		System.out.print(a[i]+" ");
		}
	}
}
