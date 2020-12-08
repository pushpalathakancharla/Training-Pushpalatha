package com.motivity;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Doctorupdatebean {
	private String name,email;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	public boolean updateValidate(String name,String email) throws ClassNotFoundException, SQLException{
		Connection con= ConnectionEx.Conectivity();
		PreparedStatement ps=con.prepareStatement("update doctor set name=?, email=? where id=?");
		ps.setString(1, name);
		ps.setString(2, email);
		int rs=ps.executeUpdate();
		if(rs!=0){
		return true;
		}else {
			return false;
		}
		
	}

	}

