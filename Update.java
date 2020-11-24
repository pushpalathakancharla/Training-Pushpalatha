package Assignment;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class Update {

	

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
	Class.forName("com.mysql.jdbc.Driver");
	String url="jdbc:mysql://localhost:3306/motivity";
	String username="root";
	String password="root";
	Connection con=DriverManager.getConnection(url, username, password);
	
	if(con!=null) {
		System.out.println("Connection established");
		
	}
	Statement st=con.createStatement();
	System.out.println(st);
	int x=st.executeUpdate("Delete from customer where name='pushpa'");
	
	if(x!=0){
		System.out.println("Record inserted");
	}
	}




}

	
	



