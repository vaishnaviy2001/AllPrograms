package jdbcdemomaven;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class User {

	public static void main(String[] args) throws SQLException
	{
	   Connection con = Helper.getConnect();
	   Statement st = con.createStatement();
	   st.execute("create table user(id int,name varchar(20),email varchar(30),password varchar(10))");
	   System.out.println("table created successfully");
	   st.execute("insert into user(id,name,email,password) values(1,'Rajesh','rajesh@gmail.com','abc123')");
	   st.execute("insert into user(id,name,email,password) values(1,'Abhishek','abhi@gmail.com','vaishu123')");
	  
	   
	   

	}

}
