package com.motivity;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class PatientupdateController extends HttpServlet {
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
String name=request.getParameter("name");

String email=request.getParameter("email");

Patientupdatebean ab=new Patientupdatebean ();
ab.setName(name);

ab.setEmail(email);

HttpSession hs=request.getSession();
hs.setAttribute("bean",ab);
boolean status=false;
try {
	status=ab.updateValidate(name,email);
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
	
		response.sendRedirect("./PatientProfileUpdate.html");
	
}
	}

}