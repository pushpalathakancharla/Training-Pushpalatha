package com.motivity;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletRequest;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


public class EmployeeLoginController extends HttpServlet {
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
String mailid=request.getParameter("mailid");
String name=request.getParameter("name");
EmployeeLoginBean lb=new EmployeeLoginBean();
lb.setMailid(mailid);
lb.setName(name);
HttpSession hs=request.getSession();
hs.setAttribute("bean",lb);
boolean status=false;
try {
	status=lb.loginValidate(mailid, name);
} catch (ClassNotFoundException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
} catch (SQLException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}
if(status) {
	response.sendRedirect("./employee_home.html");

}else {
	
		response.sendRedirect("./employee_login.html");
	
}
	}

}





	
