package com.jspider.myfirstwebapp;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class QueryString extends HttpServlet{
@Override
protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	// TODO Auto-generated method stub
	//super.doGet(req, resp);
	resp.setContentType("text/html");
	PrintWriter out=resp.getWriter();
	String fname=req.getParameter("fname");
	String lname=req.getParameter("lname");
	out.print("<h2>first name is"+fname+"</h2>");
	out.print("<h2>last name is"+lname+"</h2>");
	out.print("<h1>full name is"+fname+" "+lname+"</h1>");
}
}
