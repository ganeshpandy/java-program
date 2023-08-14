package com.exceptionHandling;

public class Example3 {
	public static void main(String[] args) {
		try {
			TrafficPolice.checkSpeed(45);
			TrafficPolice.checkSpeed(25);
		}
		catch(OverSpeedException e) {
			System.out.println("EXCEPTION EVENT");
		}
		finally {
			System.out.println("finally starts");
			System.out.println(10/0);
			System.out.println("finally ends");
		}
	}
}
