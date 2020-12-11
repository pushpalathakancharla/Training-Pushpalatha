
	package com.motivity;

	import java.sql.Connection;
	import java.sql.PreparedStatement;
	import java.sql.ResultSet;
	import java.sql.SQLException;


public class patientRegistrationBean  {
		private String name,password,email,specialization;
		private long phone;
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public String getPassword() {
			return password;
		}
		public void setPassword(String password) {
			this.password = password;
		}
		public String getEmail() {
			return email;
		}
		public void setEmail(String email) {
			this.email = email;
		}
		public String getSpecialization() {
			return specialization;
		}
		public void setSpecialization(String specialization) {
			this.specialization = specialization;
		}
		public long getPhone() {
			return phone;
		}
		public void setPhone(long phone) {
			this.phone = phone;
		}
		public boolean registerValidate(String name,String password,String email,String specialization,long phone) throws ClassNotFoundException, SQLException{
			Connection con= ConnectionEx.Conectivity();
			PreparedStatement ps=con.prepareStatement("insert into doctor(name,password,email,specialization,phone)values(?,?,?,?,?)");
			ps.setString(1, name);
			ps.setString(2, password);
			ps.setString(3,email);
			ps.setString(4,specialization);
			ps.setLong(5,phone);
			int rs=ps.executeUpdate();
			if(rs!=0) {
			return true;
			}else {
				return false;
			}
			}


	}



