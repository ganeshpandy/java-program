package com.CodeBoard;
public class MergeArray {
public static void main(String[] args) {
	int[]a1= {3,4,5};
	int[]a2= {6,7,8};
	int[]a3=new int[a1.length+a2.length];
	int count=0;//1
	for(int i=0;i<=a1.length-1;i++) {
		a3[count++]=a1[i];//3,4
	}
	for(int i=0;i<=a2.length-1;i++) {
		a3[count++]=a2[i];
		
	}
	for(int i=0;i<=a3.length-1;i++) {
		System.out.println(a3[i]);
		}

}
}
