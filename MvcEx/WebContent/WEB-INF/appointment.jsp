<!DOCTYPE html>
<html>
<body bgcolor="wheat">
<br><br><br>
<centre><h1>WELCOME TO APPOINTMENT PAGE</h1></centre>
<br><br><br>
<a href="patient_home.html">Home</a>
<a href="patient_profile.jsp">profile</a>
<a href="appointment.jsp">appointment</a>
<a href="indexhtml.html">logout</a>
<br><br><br>
<form action="apply_appointment.jsp align="center">
<input type="text" name="patient_name" placeholder="Enter your patientname">
<input type="number" name="phone" placeholder="Enter your phone">
<input type="text" name="email" placeholder="Enter your email">
<input type="radio"name="gender" value="Female">Female
<input type="radio"name="gender" value="male">male
<select name="blood_group">
<option value="A+">A+</option>
<option value="B+">B+</option>
<option value="AB+">AB+</option>
<option value="O+">O+</option>
<option value="A-">A-</option>
<option value="B-">B-</option>
<option value="O-">O-</option>
<option value="AB-">AB-</option>
</select>
<select name="speciaist">
<option value="DENSTIST">DENSTIST</option>
<option value="ENT">ENT</option>
<option value="CARDIOLOGIST">CARDIOLOGIST</option>
</select>
<input type="date" name="date_of_appointment" placeholder="select date">
<input type="time" name="time_of_appointment" placeholder="select time">
<input type="submit" value="Apply">

</form>
</body>
</html>s