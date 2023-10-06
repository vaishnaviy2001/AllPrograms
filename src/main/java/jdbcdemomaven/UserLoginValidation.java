package jdbcdemomaven;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class UserLoginValidation {

	public static void main(String[] args) throws SQLException
	{
      Connection con = Helper.getConnect();
      PreparedStatement ps = con.prepareStatement("select * from user where email=? and password=?");
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter email");
      String email =sc.next();
      
      System.out.println("Enter Password");
      String password=sc.next();
      
      ps.setString(1, email);
      ps.setString(2, password);
      ResultSet rs=ps.executeQuery();
      
      if(rs.next()) {
    	  System.out.println("Welcome");
      }
      else
      {
    	  System.out.println("Invalid credentials");
      }
      

	}

}
