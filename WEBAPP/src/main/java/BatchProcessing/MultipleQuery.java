package BatchProcessing;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class MultipleQuery {
	public static void main(String[] args) {
		Connection connection=null;
		Statement statement=null;
		ResultSet resultSet=null;
		PreparedStatement preparedStatement=null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			String dburl="jdbc:mysql://localhost:3306/management?user=root&password=root";
			connection=DriverManager.getConnection(dburl);
			String query1="select * from employee";
			String query2="insert into employee values(5,'Subramani',12000,'it')";
			String query3="select * from employee where empid=?";
		    statement=connection.createStatement();
		    statement.addBatch(query1);
		    statement.addBatch(query2);
		    statement.addBatch(query3);
		    resultSet=statement.executeQuery(query1);
		    while(resultSet.next()) {
				int id=resultSet.getInt(1);
				String empname=resultSet.getString(2);
				String role=resultSet.getString(3);
				Double salary=resultSet.getDouble(4);
				System.out.println("Employee Details : "+id+" "+empname+" "+role+" "+salary);
				}
		    int count=statement.executeUpdate(query2);
		    if(count!=0) {
		    	System.out.println("-----------------------------");
				System.out.println("Data Inserted Successfully !!!");
			}else {
				System.out.println("not inserted invalid credentials!please check!!!");
			}
		    preparedStatement=connection.prepareStatement(query3);
			preparedStatement.setInt(1, count);
			resultSet=preparedStatement.executeQuery();
		    if(resultSet.next()) {
				int id=resultSet.getInt(1);
				String empname=resultSet.getString(2);
				String role=resultSet.getString(3);
				String salary=resultSet.getString(4);
				System.out.println("Student Details : "+id+" "+empname+" "+role+" "+salary);
			}
		    else {
		    	System.out.println("Given id is not present in the database Student_database !");
		    }
			
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
		finally {
			if(connection!=null) {
				try {
					connection.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
			if(statement!=null) {
				try {
					statement.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
			if(resultSet!=null) {
				try {
					resultSet.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
			if(preparedStatement!=null) {
				try {
					preparedStatement.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}
	}
}