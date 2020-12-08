package com.motivity;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class patientRegisterController extends HttpServlet {
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
String name=request.getParameter("name");
String password=request.getParameter("password");
String email=request.getParameter("email");
String specialization=request.getParameter("specialization");
long phone=Long.parseLong(request.getParameter("phone"));
patientRegistrationBean ab=new patientRegistrationBean ();
ab.setName(name);
ab.setPassword(password);
ab.setEmail(email);
ab.setPassword(specialization);
ab.setPhone(phone);
HttpSession hs=request.getSession();
hs.setAttribute("bean",ab);
boolean status=false;
try {
	status=ab.registerValidate(name,password,email,specialization,phone);
} catch (ClassNotFoundException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
} catch (SQLException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}
if(status) {
	response.sendRedirect("./patient_login.html");

}else {
	
		response.sendRedirect("./patient_register.html");
	
}
	}

}