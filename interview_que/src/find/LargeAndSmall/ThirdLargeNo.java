package find.LargeAndSmall;

import java.util.Scanner;

public class ThirdLargeNo {
public static void main(String[] args) {
	System.out.println("enter the number to find the largest no");
	int []arr= {11,12,13,14,15};
	int flarge=arr[0];
	int slarge=arr[1];
	int tlarge=arr[2];
	for(int i=1;i<arr.length;i++) {
	
	if(arr[i]>flarge){
		slarge=flarge;
		flarge=arr[i];
		}
	
	else if(arr[i]>slarge){
		slarge=arr[i];	
	}
	else if(arr[i]>tlarge) {
		tlarge=arr[i];
	}
}
//    if (i >= 0 && i <arr.length) {
//        System.out.println("Value at index " + i + " is " + arr[i]);
//    } 
	System.out.println("Largest Number:"+tlarge);
	}
}
