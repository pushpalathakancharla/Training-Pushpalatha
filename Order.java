package Assignment;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class Order {

	
		public static void main(String[] args) throws ClassNotFoundException, SQLException {
			Class.forName("com.mysql.jdbc.Driver");
			String url="Jdbc:mysql://localhost:3306/motivity";
			String username="root";
			String password="root";
			Connection con=DriverManager.getConnection(url, username, password);
			Statement st=con.createStatement();
			Scanner sc=new Scanner(System.in);
			System.out.println("select options->customerid or name");
			String option=sc.next();
			String sn="select * from user order by "+option+";";
			ResultSet s=st.executeQuery(sn);
			while(s.next()) {
				System.out.println(s.getInt(1)+"-"+s.getString(2));
		
			}
		}

				
}		
			

	


