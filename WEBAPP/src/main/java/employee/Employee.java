package employee;
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

public class Employee extends HttpServlet{
@Override
protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	//super.doGet(req, resp);
	resp.setContentType("text/html");
	PrintWriter out=resp.getWriter();
	try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		//step2 create connection
		String dburl="jdbc:mysql://localhost:3306/management?user=root&password=root";
		Connection con=DriverManager.getConnection(dburl);
		//issue the query
		String query="select * from employee";
		//create statement
		Statement stmt=con.createStatement();
		//step4 execute the query
		ResultSet rs=stmt.executeQuery(query);
		out.print("<table border=1 align=center>");
		while(rs.next()) 
		{
			out.print("<tr>");
			out.print("<td>"+rs.getInt("id")+"</td>");
			out.print("<td>"+rs.getString("empname")+"</td>");
			out.print("<td>"+rs.getString("role")+"</td>");
			out.print("<td>"+rs.getDouble("salary")+"</td>");
			out.print("</tr>");
		}
		out.print("</table>");
	} catch (ClassNotFoundException | SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
		}
	finally {
		if(out!=null) {
			out.close();
		}
	}
		
	}
}


