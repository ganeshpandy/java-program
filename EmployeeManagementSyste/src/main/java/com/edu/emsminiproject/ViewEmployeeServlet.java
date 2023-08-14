package com.edu.emsminiproject;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ViewEmployeeServlet extends HttpServlet{
@Override
protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	// TODO Auto-generated method stub
	resp.setContentType("text/html");
	PrintWriter out=resp.getWriter();
	//jdbc process
	try {
	Class.forName("com.mysql.cj.jdbc.Driver");
	//step create connection
	String dburl="jdbc:mysql://localhost:3306/ems?user=root&password=root";
	Connection con=DriverManager.getConnection(dburl);
	//issue the query
	String query="select * from employee";
	//create statement
	Statement stmt=con.createStatement();
	//execute the query
	ResultSet rs=stmt.executeQuery(query);
	out.println("<table cellspacing='0'width='350px'border='1'>");
	out.println("<tr>");
	out.print("<td>id</td>");
	out.println("<td>fname</td>");
	out.println("<td>lname</td>");
	out.println("<td>edit</td>");
	out.print("<td>delete</td>");
	out.print("</tr>");
	while(rs.next()) {
		out.print("<tr>");
		out.print("<td>"+rs.getString("id")+"</td>");
		out.print("<td>"+rs.getString("fname")+"</td>");
		out.print("<td>"+rs.getString("lname")+"</td>");
		out.print("</tr>");
	}
	out.print("<table>");
	}
	catch(ClassNotFoundException e) {
		e.printStackTrace();
	}
	catch(SQLException e) {
		e.printStackTrace();
		out.print("<font color='red'>Record failed</font>");
		}
	}
}
