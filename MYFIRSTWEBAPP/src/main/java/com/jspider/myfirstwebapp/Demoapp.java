package com.jspider.myfirstwebapp;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Demoapp extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException 
	{
		//super.doGet(req, resp);
		resp.setContentType("html/text");
		PrintWriter printwriter=resp.getWriter();
		printwriter.print(new java.util.Date());//date class object inside the print as parameter
		/*step9:URL configuration
		 * dynamic web application ------->url configuration is mandatory
		 * web content/webApp
		 		* ----->META-INF
		 		* ----->WEB-INF
		 				*--->lib------->inside web.xml file only
		 *i need provide  url configuration for dynamic web application*/
		 	
	}
}
