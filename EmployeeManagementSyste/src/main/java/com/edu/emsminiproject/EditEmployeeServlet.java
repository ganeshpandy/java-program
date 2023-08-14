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

public class EditEmployeeServlet extends HttpServlet{
@Override
protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	// TODO Auto-generated method stub
resp.setContentType("text/html");
PrintWriter out=resp.getWriter();
//jdbc steps
try {
	Class.forName("com.mysql.cj.jdbc.Driver");
	//step 2 create connection
	String dburl="jdbc://localhost:3306/ems?user=root&password=root";
	Connection con=DriverManager.getConnection(dburl);
	//processing edit data using query string
	String id=req.getParameter("id");
	String fname=req.getParameter("fname");
	String lname=req.getParameter("lname");
	//create statement
	PreparedStatement psmt=con.prepareStatement("update employee set fname=?set lname=?where id=?");
	psmt.setString(1, id);
	psmt.setString(2, fname);
	psmt.setString(3, lname);
	//execute the query
	int count=psmt.executeUpdate();
	out.print("<font color='green'>Record update successfully</font>");
} 
catch (ClassNotFoundException e) {

	e.printStackTrace();
}
catch(SQLException e) {
	out.print("<font color='red'>record update failed</font>");
}
}
}
