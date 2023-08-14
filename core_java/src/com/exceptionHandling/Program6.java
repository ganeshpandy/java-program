package com.exceptionHandling;

import java.io.FileWriter;
import java.io.IOException;

public class Program6 
{
	static void play() throws IOException
	{
		FileWriter ref=new FileWriter("Demo.txt");
	}
	static void run() throws IOException
	{
		play();
	}
	public static void main(String[] args) throws IOException
	{
		run();
	}
}
