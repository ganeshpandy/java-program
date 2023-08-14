package com.j2ee.jdbc2ndStep;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class FirstWayConnection {
public static void main(String[] args) {
	try {
		//step 1 loading the driver
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		//step 2 Create connection or establish the connection
		String dburl="jdbc:mysql://localhost:3306/3eje2?user=root&password=root";
		Connection con=DriverManager.getConnection(dburl);
		if(con!=null) {
			System.out.println("connection established successfully");
		}else {
			System.out.println("Connection is not established");
		}
		
		
	} catch (ClassNotFoundException | SQLException e) {
		e.printStackTrace();
	}
	
}
}
