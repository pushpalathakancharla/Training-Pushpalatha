	package Assignment;
		import java.sql.Connection;
		import java.sql.DriverManager;
		import java.sql.ResultSet;
		import java.sql.SQLException;
		import java.sql.Statement;
import java.util.Scanner;

		public class Scanninsert {

			public static void main(String[] args) throws ClassNotFoundException, SQLException {
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
				System.out.println("Enter uid");
				int uid=sc.nextInt();
				System.out.println("Enter name");
				String name=sc.next();
				System.out.println("Enter city");
				String city=sc.next();
			System.out.println("Enter address");
				String address=sc.next();
				
				int x=st.executeUpdate("insert into user values('"+uid+"', '"+name+"' ,'"+city+"', '"+address+"')");
				if(x!=0)
				{
					System.out.println("Record Inserted");
				}
				
				
				

	}

}
