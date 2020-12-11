package com.motivity;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class EmployeeUpdateController extends HttpServlet {
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
String name=request.getParameter("name");

String mailid=request.getParameter("mailid");

EmployeeUpdateBean ab=new EmployeeUpdateBean ();
ab.setName(name);

ab.setMailid(mailid);

HttpSession hs=request.getSession();
hs.setAttribute("bean",ab);
boolean status=false;
try {
	status=ab.updateValidate(name,mailid);
} catch (ClassNotFoundException e) {
	
	// TODO Auto-generated catch block
	e.printStackTrace();
} catch (SQLException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}
if(status) {
	response.sendRedirect("./employee_login.html");

}else {
	
		response.sendRedirect("./EmployeeProfileUpdate.html");
	
}
	}

}