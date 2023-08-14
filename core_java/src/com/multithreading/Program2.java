package com.multithreading;
class SampleThread implements Runnable//1
{
	@Override
	public void run() //2
	{
		for(int i=0;i<5;i++) {
			System.out.println("samplethread.....");
		}
	}
}
public class Program2 {
	public static void main(String[] args) {
		System.out.println("Program Starts");
		SampleThread st=new SampleThread();//3
		Thread th=new Thread(st);//4
		th.start();//5
		for(int i=0;i<5;i++) {
			System.out.println("mainthread.....");
		}
		System.out.println("Program Ends");
	}
}
