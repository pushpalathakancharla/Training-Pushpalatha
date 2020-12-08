package com.motivity;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionEx {
	public static Connection Conectivity() throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.jdbc.Driver");
		String url="Jdbc:mysql://localhost:3306/NewlifeApplication";
		String username="root";
		String password="root";
		Connection con=DriverManager.getConnection(url, username, password);
		return con;
		
		}
	}


