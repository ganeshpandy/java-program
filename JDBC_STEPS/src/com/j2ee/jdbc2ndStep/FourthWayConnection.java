package com.j2ee.jdbc2ndStep;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class FourthWayConnection {
public static void main(String[] args) {
	try {	
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/3eje2?user=root&password=root");
		if(con!=null) {
			System.out.println("connection is done");
		}
		else
		{
			System.out.println("not connected");
		}
	} catch (ClassNotFoundException | SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}
}
