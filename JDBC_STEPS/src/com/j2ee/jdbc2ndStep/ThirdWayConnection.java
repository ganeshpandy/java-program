package com.j2ee.jdbc2ndStep;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class ThirdWayConnection {
public static void main(String[] args) {
	//step 1 load the driver
	try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		//step 2 create connection using 3rd way
		File f=new File("./credentials/configuration.properties");
		FileReader reader=new FileReader(f);
		//step create object of property
		Properties prop=new Properties();
		prop.load(reader);
		String dburl=prop.getProperty("dburl");
		Connection con=DriverManager.getConnection(dburl,prop);
		if(con!=null) {
			System.out.println("connection is done");
		}
		else {
			System.out.println("invalid details for connection");
		}
	}
	catch (ClassNotFoundException | IOException | SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	
}
}
