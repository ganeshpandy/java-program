package com.j2ee.jdbcstep1;

import java.sql.DriverManager;
import java.sql.SQLException;

public class LoadTheDriverFirsrWay {
public static void main(String[] args) {
	//invoking register driver method
	try {
		java.sql.Driver driver=new com.mysql.cj.jdbc.Driver();
		DriverManager.registerDriver(driver);
		System.out.println("loading the driver first way is successful");
	} 
	catch (SQLException e) {
		e.printStackTrace();
	}
	
}
}
