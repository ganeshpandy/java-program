package com.edu.emsminiproject;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class EmployeeServlet extends HttpServlet{
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException 
	{
		resp.setContentType("text/html");
		PrintWriter out = resp.getWriter();
		try {
			//load the driver
			Class.forName("com.mysql.cj.jdbc.Driver");
			//create connection
			String dburl = "jdbc:mysql://localhost:3306/management?user=root&password=root";
			Connection con = DriverManager.getConnection(dburl);
			String id=req.getParameter("id");
			String fname=req.getParameter("fname");
			String lname=req.getParameter("lname");
			//create statement and issue the query
			PreparedStatement psmt=con.prepareStatement("insert into employee(id,fname,lname)value(?,?,?");
			psmt.setString(1, id);
			psmt.setString(2, fname);
			psmt.setString(3, lname);
			//step4 execute the query
			int count=psmt.executeUpdate();
			out.print("<h1 font color='green'>Record Added successfully</h1>");
			out.print("<font color='green'>Record Addede successfully</font>");
		}
		catch(ClassNotFoundException e) {
			e.printStackTrace();
		}
		catch(SQLException e) {
			e.printStackTrace();
		}
	}
}
