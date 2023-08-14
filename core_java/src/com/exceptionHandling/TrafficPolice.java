package com.exceptionHandling;

public class TrafficPolice 
{
	public static void checkSpeed(int speed)
	{
		if(speed>60) {
			throw new OverSpeedException();
		}
	}
}