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

public class DeleteEmployeeServlet extends HttpServlet{
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
	PreparedStatement psmt=con.prepareStatement("delete from employee where id=?");
	psmt.setString(1, id);
	//create the query
	int count=psmt.executeUpdate();
	out.print("<font color='green'>Record deleted successfully</font>");
}
catch(ClassNotFoundException e) {
	e.printStackTrace();
}
catch(SQLException e) {
	out.print("<font color='red'>record delete failed");
}
}
}
