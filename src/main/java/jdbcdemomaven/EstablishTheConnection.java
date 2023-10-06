package jdbcdemomaven;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class EstablishTheConnection
{public static void main(String[] args) throws SQLException
{
	Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306","root","root");
	System.out.println("connection established successfully");
	
}

}
