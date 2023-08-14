package com.Array_concept;
import java.util.*;
public class IntializeArrayUsingScan {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the size of the element");
	int size=sc.nextInt();
	int[] array=new int[size];
	System.out.println("Enter the elements of an array:");
	for(int i=0 ; i<size ; i++)
	{
       array[i]=sc.nextInt();
	}
    System.out.println("The entered elements are:");
    for(int i=0 ; i<size ; i++)
    {
    	System.out.print(array[i]+"  ");
    }
    
}
}
