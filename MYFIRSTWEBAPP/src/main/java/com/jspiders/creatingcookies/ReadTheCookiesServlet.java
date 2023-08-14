package com.jspiders.creatingcookies;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ReadTheCookiesServlet extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		resp.setContentType("text/html");
		PrintWriter out=resp.getWriter();
		Cookie[]allCookies=req.getCookies();
		if(allCookies!=null) {
			for(Cookie cookie:allCookies) {
				out.print("<h1>Name"+cookie.getName()+"value"+cookie.getValue()+"</h1>");
			}
		}
		
		else {
			out.print("<h1>cookies are not present</h1>");
		}
	}
}
