package jdbcdemomaven;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class createstatement {

	public static void main(String[] args) throws SQLException
	{
		Connection con=DriverManager.getConnection("jdbc.mysql://localhost:3306/school","root","root");
		Statement st=con.createStatement();
		System.out.println("Statement created successfully");

	}

}
