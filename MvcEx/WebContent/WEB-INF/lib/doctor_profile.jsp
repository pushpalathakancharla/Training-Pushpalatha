<!DOCTYPE html>
<html>
<body bgcolor="wheat">
<br><br><br>
<centre><h1>WELCOME TO DOCTOR HOME</h1></centre>
<br><br><br>
<a href="doctor_home.html">Home</a>
<a href="doctor_profile.jsp">profile</a>
<a href="view_appointment.jsp">Appointment Details</a>
<a href="index.html">logout</a>
<br><br><br>
<%@page import="com.motivity.DoctorLoginBean" %>
<%
	DoctorLoginBean lb=(DoctorLoginBean)session.getAttribute("bean");
%>
<%=lb.getEmail() %>
</body>
</html>