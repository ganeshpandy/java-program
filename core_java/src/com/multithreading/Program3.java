package com.multithreading;
class ExampleThread extends Thread
{
	@Override
	public void run() 
	{
		for(int i=0;i<5;i++)
		{
			Thread t=Thread.currentThread();
			System.out.println("ID : "+t.getId()+" Name : "+t.getName()+" Priority : "+t.getPriority());
		}
	}
}
public class Program3 {
	public static void main(String[] args) {
		ExampleThread thread1=new ExampleThread();
		thread1.setName("obito");
		thread1.setPriority(10);
		ExampleThread thread2=new ExampleThread();
		thread2.setName("mojito");
		thread2.setPriority(1);
		thread1.start();
		thread2.start();
		
	}
}
