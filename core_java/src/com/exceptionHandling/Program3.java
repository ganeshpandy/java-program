package com.exceptionHandling;
class Demo
{
	void test() {
		System.out.println("Executing test().....");
	}
}
public class Program3 
{
	static void instantiate() throws ClassNotFoundException,IllegalAccessException,InstantiationException
	{
		Demo d=(Demo)Class.forName("com.qspiders.exceptionHandling.Demo").newInstance();
		d.test();
	}
	public static void main(String[] args) throws ClassNotFoundException,IllegalAccessException,InstantiationException
	{
		instantiate();
	}
}