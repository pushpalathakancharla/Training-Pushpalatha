package Assignment;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class Like {

	
		public static void main(String[] args) throws ClassNotFoundException, SQLException{
			Scanner sc=new Scanner(System.in);
			Class.forName("com.mysql.jdbc.Driver");
				String url="Jdbc:mysql://localhost:3306/motivity";
				String username="root";
				String password="root";
				Connection con=DriverManager.getConnection(url, username, password);
				
				if(con!=null) {
					System.out.println("Connection established");
					
				}
				Statement st=con.createStatement();
				System.out.println("Enter character at first letter");
				String ch=sc.next();
				
				String qr="select * from customer where name like'"+ch+"%';";
				ResultSet sm=st.executeQuery(qr);
				while(sm.next()) {
					System.out.println(sm.getInt(1)+"-"+sm.getString(2));
				}

	}

}
