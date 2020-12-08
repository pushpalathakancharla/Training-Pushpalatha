package com.motivity;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class appointmentBean {
	private String gender,specialist,email;

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getSpecialist() {
		return specialist;
	}

	public void setSpecialist(String specialist) {
		this.specialist = specialist;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	public boolean registerValidate(String gender,String specialist,String email) throws ClassNotFoundException, SQLException{
		Connection con= ConnectionEx.Conectivity();
		PreparedStatement ps=con.prepareStatement("insert into appointment(gender,specilist,email)values(?,?,?)");
		ps.setString(1, gender);
		ps.setString(2, specialist);
		ps.setString(3,email);
		
		int rs=ps.executeUpdate();
		if(rs!=0) {
		return true;
		}else {
			return false;
		}
		}

}
