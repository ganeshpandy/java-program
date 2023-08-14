package com.revolite.interview;

public class CountDuplicate {
public static void main(String[] args) {
	int []a= {10,20,10,20,30};
	int temp=0;
	//for sorting array
	for(int i=0;i<a.length-1;i++) {
		for(int j=0;j<a.length-2;j++) {
			if(a[j]>a[j+1]) {
				temp=a[j];
				a[j]=a[j+1];
				a[j+1]=temp;
			}
		}
	}
	//count duplicate
	int count=1;//10,10,20,20,30
	for(int i=0;i<=a.length-2;i++) {
		if(a[i]==a[i+1]) {
			count++;
		}
		else {
			System.out.println(a[i]+"="+count);
			count=1;
		}
	}
	//print the result
	System.out.println(a[a.length-1]+"="+count);
}
}
