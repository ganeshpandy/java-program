package com.books.project;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class jdbcservlet4 extends HttpServlet
{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException 
	{
		resp.setContentType("text/html");
		PrintWriter out = resp.getWriter();
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter book id : ");
		int id = sc.nextInt();
		try 
		{
			// step 1 loading the driver 
			Class.forName("com.mysql.cj.jdbc.Driver");
			// step 2 create connection 
			String dburl = "jdbc:mysql://localhost:3306/management?user=root&password=root";
			Connection con = DriverManager.getConnection(dburl);
			// isssue the query 
			String query = "delete from books where id=? ";
			// step 3 create statement 
			PreparedStatement psmt = con.prepareStatement(query);
			psmt.setInt(1, id);
			//step 4 execute the query with help of helper 
			int count=psmt.executeUpdate();
			if(count!=0)
			{
				out.println("<h1>data deleted successfully done.......</h1>");
			}
			else
			{
				out.println("<h1>invalid data check once again.....</h1>");
			}
			
		} 
		catch (ClassNotFoundException  e) 
		{
			e.printStackTrace();
		}
		catch(SQLException e1)
		{
	
		e1.printStackTrace();
		}
		finally
		{
			if(out!=null)
			{
				out.close();
			}
		}
		
	}
}

