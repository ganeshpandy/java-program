package com.j2ee.ThirdstepAnd4thstep;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class DynamicSelectType {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the student id:");
	int id=sc.nextInt();
	//step 1 load the driver
	try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		//step2 create connection
		String dburl="jdbc:mysql://localhost:3306/3eje2?user=root&password=root";
		Connection con=DriverManager.getConnection(dburl);
		String query="select * from Student_database where id=?";
		PreparedStatement psmt=con.prepareStatement(query);
		psmt.setInt(1, id);
		ResultSet rs=psmt.executeQuery();
		if(rs.next())
		{
			int id1=rs.getInt(1);
			String fname=rs.getString(2);
			String lname=rs.getString(3);
			double percentge=rs.getDouble(4);
			String degree=rs.getString(5);
			int yop=rs.getInt(6);
			System.out.println(id+" "+fname+" "+lname+" "+" "+percentge+" "+" "+degree+" "+yop);	
		}
		else
		{
			System.out.println("given id is not present");
		}
	} catch (ClassNotFoundException | SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
}
}
