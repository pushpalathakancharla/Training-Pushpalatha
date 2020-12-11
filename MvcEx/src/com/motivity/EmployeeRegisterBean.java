package com.motivity;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class EmployeeRegisterBean {
	private String mailid,name,salary,Desgination;

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

	public String getSalary() {
		return salary;
	}

	public void setSalary(String salary) {
		this.salary = salary;
	}

	public String getDesgination() {
		return Desgination;
	}

	public void setDesgination(String desgination) {
		Desgination = desgination;
	}
	public boolean registerValidate(String name,String mailid,String salary,String Desgination) throws ClassNotFoundException, SQLException{
		Connection con= ConnectionEx.Conectivity();
		PreparedStatement ps=con.prepareStatement("insert into employee(name,mailid,salary,Desgination)values(?,?,?,?)");
		ps.setString(1, name);
		ps.setString(2, mailid);
		ps.setString(3,salary);
		ps.setString(4,Desgination);
	int rs=ps.executeUpdate();
		if(rs!=0) {
		return true;
		}else {
			return false;
		}
		}


}
