package com.motivity;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class ManagerupdateBean {
	private String name,salary;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSalary() {
		return salary;
	}

	public void setSalary(String salary) {
		this.salary = salary;
	}
	public boolean updateValidate(String name,String salary) throws ClassNotFoundException, SQLException{
		Connection con= ConnectionEx.Conectivity();
		PreparedStatement ps=con.prepareStatement("update manager set name=?, salary=? where id=?");
		ps.setString(1, name);
		ps.setString(2, salary);
		int rs=ps.executeUpdate();
		if(rs!=0){
		return true;
		}else {
			return false;
		}
	}
}
