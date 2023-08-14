package com.j2ee.ThirdstepAnd4thstep;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class StaticSelectType {
public static void main(String[] args) 
{
//step1 load the driver
	try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		//step2 create connection
		String dburl="jdbc:mysql://localhost:3306/3eje2?user=root&password=root";
		Connection con=DriverManager.getConnection(dburl);
		//issue the query
		String query="select * from student_database";
		//create statement
		Statement stmt=con.createStatement();
		//step4 execute the query
		ResultSet rs=stmt.executeQuery(query);
		while(rs.next()) 
		{
			int id=rs.getInt(1);
			String fname=rs.getString(2);
			String lname=rs.getString(3);
			double percentge=rs.getDouble(4);
			String degree=rs.getString(5);
			int yop=rs.getInt(6);
			System.out.println(id+" "+fname+" "+lname+" "+" "+percentge+" "+" "+degree+" "+yop);
		}
	} catch (ClassNotFoundException | SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
		}
	}
}
