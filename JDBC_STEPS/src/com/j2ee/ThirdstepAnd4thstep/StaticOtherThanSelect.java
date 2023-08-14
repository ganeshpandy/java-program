package com.j2ee.ThirdstepAnd4thstep;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class StaticOtherThanSelect {
public static void main(String[] args) {
	//step1 loading the driver
	try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		//step2 create connection 
		String dburl="jdbc:mysql://localhost:3306/3eje2?user=root&password=root";
		Connection con=DriverManager.getConnection(dburl);
		//issue the sql query
		String query="insert into student_database values(6,'smith','a','56','bsc','2019')";
		//step3------------>create the statement
		Statement stmt=con.createStatement();
		//step4------------>execute query with help of  helper method
		int count=stmt.executeUpdate(query);
		//processing the result
		if(count!=0) {
			System.out.println("data inserted successfully");
		}
		else {
			System.out.println("not inserted");
			}}
		catch (ClassNotFoundException | SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
			}
		}
	}
