package com.edu.emsminiproject;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class EditReturnEmployeeServlet extends HttpServlet{
@Override
protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	// TODO Auto-generated method stub
resp.setContentType("text/html");
PrintWriter out=resp.getWriter();
String id=req.getParameter("id");
//jdbc process
try {
Class.forName("com.mysql.cj.jdbc.Driver");
//step create connection
String dburl="jdbc:mysql://localhost:3306/ems?user=root&password=root";
Connection con=DriverManager.getConnection(dburl);
//issue the query
String query="select * from employee where id=?";
//create statement
PreparedStatement psmt=con.prepareStatement(query);
ResultSet rs=psmt.executeQuery();
while(rs.next()) {
	out.print("<form action='edit'method='POST'>");
	out.print("<table>");
	out.print("<tr><td>id</td><td><input type='text'name='id'id='id'value='"+rs.getString("id")+"'></td></tr>");
	out.print("<tr><td>fname</td><td><input type='text'name='fname'fname='fname'value='"+rs.getString("id")+"'></td></tr>");
	out.print("<tr><td>lname</td><td><input type='text'name='lname'lname='lname'value='"+rs.getString("id")+"'></td></tr>");
	out.print("<tr><td><input type='submit'value='edit'></td></tr>");
	out.print("</table>");
	out.print("</form>");
}
		}
catch(ClassNotFoundException e) {
	out.print("<font color='red'>");
	e.printStackTrace();
}
catch(SQLException e) {
	e.printStackTrace();
}
	}
}