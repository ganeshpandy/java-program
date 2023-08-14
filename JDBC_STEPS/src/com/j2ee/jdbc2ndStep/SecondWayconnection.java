package com.j2ee.jdbc2ndStep;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class SecondWayconnection {
public static void main(String[] args) {
	try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		//step 2-- second way of connection
		String dburl="jdbc:mysql://localhost:3306/3eje2";
		Connection con=DriverManager.getConnection(dburl, "root","root");
		if(con!=null) {
			System.out.println("connection established successful");
		}
		else
		{
			System.out.println("Connection is not established");
		}
	}
	
	catch (ClassNotFoundException | SQLException e) {
		e.printStackTrace();
	}
}
}
