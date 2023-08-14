package com.exceptionHandling;

public class Program1 
{
	public static void main(String[] args) 
	{
		
		try
		{
			System.out.println("try Starts");
			System.out.println(10/0);
			System.out.println("try Ends");
		}
		catch(ArithmeticException e)
		{
			e.printStackTrace();
		}
		finally {
			System.out.println("Executing Finally Block");
		}
	}
}
