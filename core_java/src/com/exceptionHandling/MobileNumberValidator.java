package com.exceptionHandling;

public class MobileNumberValidator 
{
	public static void verifyMobileNumber(String mobile) throws InvalidMobileNumberException
	{
		if(mobile.length()!=10) {
			throw new InvalidMobileNumberException();
		}
	}
}
