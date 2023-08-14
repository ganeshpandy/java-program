package com.exceptionHandling;

public class Example2 {
	public static void main(String[] args) {
		try {
			MobileNumberValidator.verifyMobileNumber("6364884447");
			MobileNumberValidator.verifyMobileNumber("7892722348");
			MobileNumberValidator.verifyMobileNumber("78927222348");
			System.out.println("SAFE");
		}
		catch(InvalidMobileNumberException e) {
			e.printStackTrace();
		}
	}
}
