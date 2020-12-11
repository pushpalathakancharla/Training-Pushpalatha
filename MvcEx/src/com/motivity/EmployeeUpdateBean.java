package com.motivity;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class EmployeeUpdateBean {
	private String name,mailid;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getMailid() {
		return mailid;
	}

	public void setMailid(String mailid) {
		this.mailid = mailid;
	}
	public boolean updateValidate(String name,String mailid) throws ClassNotFoundException, SQLException{
		Connection con= ConnectionEx.Conectivity();
		PreparedStatement ps=con.prepareStatement("update patient set name=?, mailid=? where id=?");
		ps.setString(1, name);
		ps.setString(2, mailid);
		int rs=ps.executeUpdate();
		if(rs!=0){
		return true;
		}else {
			return false;
		}
		
	}

	}


