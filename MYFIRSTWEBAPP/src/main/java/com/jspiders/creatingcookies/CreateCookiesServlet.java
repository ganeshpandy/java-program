package com.jspiders.creatingcookies;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class CreateCookiesServlet extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html");
		PrintWriter out=resp.getWriter();
		//creating cookies by creating object of cookies class
		Cookie c1=new Cookie("cookie1","100");
		c1.setMaxAge(60*0*24);
		
		Cookie c2= new Cookie("cookie2","200");
		c2.setMaxAge(60*0*24*7);
		
		Cookie c3=new Cookie("cookie3","300");
		c3.setMaxAge(60*0*24*7*2);
		
		Cookie c4=new Cookie("cookie4","400");
		c4.setMaxAge(60*0*24*7*2*2);
		
		Cookie c5=new Cookie("cookie5","500");
		c1.setMaxAge(60*0*24*3*4*5);
		
		resp.addCookie(c1);
		resp.addCookie(c2);
		resp.addCookie(c3);
		resp.addCookie(c4);
		resp.addCookie(c5);
		
		out.print("<h1> cookies are created!!!</h1>");
		
	}

}
