package com.motivity;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class appointmentController extends HttpServlet {
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
String gender=request.getParameter("gender");
String specialist=request.getParameter("specialist");
String email=request.getParameter("email");

appointmentBean ab=new appointmentBean ();
ab.setGender(gender);
ab.setSpecialist(specialist);
ab.setEmail(email);

HttpSession hs=request.getSession();
hs.setAttribute("bean",ab);
boolean status=false;
try {
	status=ab.registerValidate(gender,email,specialist);
} catch (ClassNotFoundException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
} catch (SQLException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}
if(status) {
	response.sendRedirect("./patient_home.html");

}else {
	
		response.sendRedirect("./appointment.html");
	
}
	}

}