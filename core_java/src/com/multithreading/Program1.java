package com.multithreading;
class DemoThread extends Thread//1
{
	@Override//2
	public void run() 
	{
		for(int i=0;i<5;i++)
		{
			System.out.println("demo thread.....");
		}
	}
}
public class Program1 
{
	public static void main(String[] args) 
	{
		System.out.println("Program Starts");
		DemoThread dt=new DemoThread();//3
		dt.start();
		for(int i=0;i<5;i++)
		{
			System.out.println("main thread.....");
		}
		System.out.println("Program Ends");
	}
}