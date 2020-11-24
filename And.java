package Assignment;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class And {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.jdbc.Driver");
		String url="Jdbc:mysql://localhost:3306/motivity";
		String username="root";
		String password="root";
		Connection con=DriverManager.getConnection(url, username, password);
		Statement st=con.createStatement();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter uid");
		int uid1=sc.nextInt();
		System.out.println("Enter uid");
		int uid2=sc.nextInt();
		String qr="Select name,city,address from user where uid="+uid1+"and uid="+uid2+";";
		System.out.println(qr);
		ResultSet s=st.executeQuery(qr);
		while(s.next()) {
			System.out.println(s.getInt(1)+"-"+s.getString(2)+" _"+s.getString(3)+" -"+s.getString(4));
	
		}

	}

}
