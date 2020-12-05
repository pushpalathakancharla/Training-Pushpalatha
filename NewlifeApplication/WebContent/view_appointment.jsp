<!DOCTYPE html>
<html>
<body bgcolor="wheat">
<br><br><br>
<centre><h1>WELCOME TO DOCTOR HOME</h1></centre>
<br><br><br>
<a href="doctor_home.html">Home</a>
<a href="doctor_profile.jsp"> Doctor profile</a>
<a href="patient_profile.jsp"> Patient profile</a>
<a href="view_appointment.jsp">Appointment Details</a>
<a href="Index.html">logout</a>
<br><br><br>
<%@ page import="java.sql.*"%>
<% 
Connection con=null;
PreparedStatement ps=null;
Class.forName("com.mysql.jdbc.Driver");
String url="Jdbc:mysql://localhost:3306/NewlifeApplication";
String username="root";
String password="root";
con=DriverManager.getConnection(url,username,password);
%>
<table border="2" width="500" height="300" cellpadding="20" align="center">
<tr><td>patient_name</td> <td>phone</td><td>email</td> 
<td>gender</td><td>blood_group</td><td>specialist</td><td>Date_of_appointment</td><td>time_of_appointment</td>
</tr>
<%
ps=con.prepareStatement("select * from appointment");
ResultSet rs=ps.executeQuery();
while(rs.next()){
%>
<tr>
<td><%=rs.getString(2) %></td>
<td><%=rs.getInt(3) %></td>
<td><%=rs.getString(4)%></td>
<td><%=rs.getString(5)%></td>
<td><%=rs.getString(6)%></td>
<td><%=rs.getString(7)%></td>
<td><%=rs.getString(8)%></td>
<td><%=rs.getString(9)%></td>
</tr>
<%}%>
</table>
</body>
</html>