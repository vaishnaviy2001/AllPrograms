package jdbcdemomaven;

import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class LibraryEstablishConnection {

	public static void main(String[] args) throws SQLException
	{
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/school","root","root");
		Statement st=con.createStatement();
		
		st.execute("create table user(id int,name varchar(20),age int)");
		
		System.out.println("table databse created successfully");

	}

}
