package SumofDigits;

import java.util.Scanner;

public class SumofGiven {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
	    System.out.println("Enter the size of an array");
	    int size=sc.nextInt();
		int[] array=new int[size];
		int sum=0;
		System.out.println("Enter the elements of an array:");
		//System.out.println("sum"+sum);
		for(int i=0 ; i<size ; i++)
		{
	       array[i]=sc.nextInt();
	       sum=sum+array[i];
		}
	    System.out.println(sum);
	}

}
