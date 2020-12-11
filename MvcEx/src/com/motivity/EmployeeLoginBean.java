package com.motivity;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class EmployeeLoginBean {
	private String mailid,name;

	public String getMailid() {
		return mailid;
	}

	public void setMailid(String mailid) {
		this.mailid = mailid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	public boolean loginValidate(String mailid,String name) throws ClassNotFoundException, SQLException{
		Connection con= ConnectionEx.Conectivity();
		PreparedStatement ps=con.prepareStatement("select * from employee where mailid=? and name=?");
		ps.setString(1, mailid);
		ps.setString(2, name);
		ResultSet rs=ps.executeQuery();
		if(rs.next()) {
		return true;
		}else {
			return false;
		}
		
	}

	}




