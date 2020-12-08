<!DOCTYPE html>
<html>
<body bgcolor="wheat">
<br><br><br>
<center><h1>WELCOME TO PATIENT HOME</h1></center>
<br><br><br>
<a href="patient_home.html">Home</a>

<a href="patient_profile.jsp">profile</a>
<a href="Index.html">logout</a>
<br><br><br>
<%@ page import="java.sql.*" %>
<table border="2" align=" centre" width="600" height="200" cellpadding="20">
<tr><td>id</td><td>name</td><td>password</td><td>email</td><td>phone</td><td>specialization</td></tr>
<% 
Connection con=null;
PreparedStatement ps=null;
Class.forName("com.mysql.jdbc.Driver");
String url="Jdbc:mysql://localhost:3306/NewlifeApplication";
String username="root";
String password="root";
con=DriverManager.getConnection(url,username,password);
String email=(String)session.getAttribute("email");
ps=con.prepareStatement("select * from doctor");
//ps.setString(1, email);
ResultSet rs=ps.executeQuery();
while(rs.next()){
%>
<tr>
<td><%=rs.getInt("id") %></td>
<td><%=rs.getString("name") %></td>
<td><%=rs.getString("password") %></td>
<td><%=rs.getString("email") %></td>
<td><%=rs.getString("phone") %></td>
<td><%=rs.getString("specialization") %></td>
<td><a href="update_profile_profile.jsp?id=<%=rs.getInt(1)%>">Update</a></td>
</tr>
<%} %>
</table>
</body>
</html>