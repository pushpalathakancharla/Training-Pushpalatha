package Motivity;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class Doctorlogin extends HttpServlet{
Connection con=null;
PreparedStatement ps=null;
public void init(ServletConfig config)
{
	try {
		Class.forName("com.mysql.jdbc.Driver");
	}catch(ClassNotFoundException e) {
		e.printStackTrace();
	}
	String url="Jdbc:mysql://localhost:3306/NewlifeApplication";
	String username="root";
	String password="root";
	try {
		con=DriverManager.getConnection(url,username,password);
}catch(SQLException e) {
	e.printStackTrace();
}
}
public void dopost(HttpServletRequest request, HttpServletResponse response) throws IOException,ServletException { 
	
	String password=request.getParameter("password");
	String email=request.getParameter("email");
	


	PrintWriter pw=response.getWriter();
	String sql="select * from doctor where email=? and password=?";
try {
		ps=con.prepareStatement(sql);

		ps.setString(1, password);
		ps.setString(2, email);
		HttpSession hs=request.getSession();
	pw.println("<html><body bgcolor='lavander'><center><h1>");
		ResultSet x=ps.executeQuery();
		if(x.next()) {
			hs.setAttribute(email, email);
			hs.setAttribute("id",x.getInt(1) );
			hs.setAttribute("specialization",x.getString("specialization"));
			response.sendRedirect("./doctor_home.html?msg=loggedin");
		}
		else
			response.sendRedirect("./doctor_login.html?msg=failed");
		
	pw.println("</h1></center></body></html>");
		
	}catch(SQLException e) {
		e.printStackTrace();
	}

}
}


		








