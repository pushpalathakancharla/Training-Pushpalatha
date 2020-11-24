package Assignment;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class program1 {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
	Class.forName("com.mysql.jdbc.Driver");
	String url="Jdbc:mysql://localhost:3306/motivity";
	String username="root";
	String password="root";
	Connection con=DriverManager.getConnection(url, username, password);
	
	if(con!=null) {
		System.out.println("Connection established");
		
	}
	Statement st=con.createStatement();
	System.out.println(st);
	ResultSet rs=st.executeQuery("select * from customer");
	
	while(rs.next()) {
		System.out.println(rs.getInt(1)+" "+rs.getString(2));
	}
	}
}
