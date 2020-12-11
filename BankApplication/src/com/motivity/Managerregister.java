package com.motivity;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class Managerregister extends HttpServlet {
	Connection con=null;
	PreparedStatement ps=null;
	public void init(ServletConfig config) {
try {
	Class.forName("com.mysql.jdbc.Driver");
}catch(ClassNotFoundException e) {
	e.printStackTrace();
}
	String url="Jdbc:mysql://localhost:3306/BankApplication";
	String username="root";
	String password="root";
	try {
		con=DriverManager.getConnection("url","username","password");
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	}
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	String name=request.getParameter("name");
	String sal=request.getParameter("sal");
	String mailid=request.getParameter("mailid");
	String password=request.getParameter("password");
	PrintWriter pw=response.getWriter();
	String sql="insert into manager(name,sal,mailid,password)values(?,?,?,?)";
	try {
		ps=con.prepareStatement(sql);
		ps.setString(1, name);
		ps.setString(2, sal);
		ps.setString(3, mailid);
		ps.setString(4,password);
		pw.println("<html><body bgcolor='wheat'><center><h1>");
		int x=ps.executeUpdate();
		if(x!=0) 
		{
			pw.println("Manager Registered sucesfully");
		pw.println("</h1></center></body></html>");
		}
	}catch(SQLException e) {
		e.printStackTrace();
	}

}

	
	
	
	}

