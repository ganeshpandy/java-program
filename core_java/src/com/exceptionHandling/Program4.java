package com.exceptionHandling;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Program4 {
	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter Value");
		try{
			int val=scn.nextInt();
			System.out.println("Value : "+val);
		}
		catch(InputMismatchException e) {
			System.out.println("Invalid Input");
		}
		finally {
			scn.close();
			System.out.println("Scanner Closed");
		}
	}
}
