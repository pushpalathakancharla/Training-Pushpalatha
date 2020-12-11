package com.motivity;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class ManagerRegisterController extends HttpServlet {
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
String name=request.getParameter("name");
String mailid=request.getParameter("mailid");
String salary=request.getParameter("salary");
String Desgination=request.getParameter("Desgination");

ManagerRegisterBean ab=new ManagerRegisterBean();
ab.setName(name);
ab.setMailid(mailid);
ab.setSalary(salary); 
ab.setDesgination(Desgination);

HttpSession hs=request.getSession();
hs.setAttribute("bean",ab);
boolean status=false;
try {
	status=ab.registerValidate(name,mailid,salary,Desgination);
} catch (ClassNotFoundException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
} catch (SQLException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}
if(status) {
	response.sendRedirect("./manager_login.html");

}else {
	response.sendRedirect("./manager_register.html");
	
}
	}

}