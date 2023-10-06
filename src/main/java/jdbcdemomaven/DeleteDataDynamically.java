package jdbcdemomaven;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class DeleteDataDynamically 
{
    public static void main(String [] args) throws SQLException, ClassNotFoundException
    {
    	Class.forName("com.mysql.cj.jdbc.Driver");
    	Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/school","root","root");
    	PreparedStatement ps = con.prepareStatement("delete from student where id=?");
    	
    	System.out.println("Enter id to delete");
    	Scanner sc = new Scanner(System.in);
    	int id=sc.nextInt();
    	
    	ps.setInt(1, id);
    	ps.execute();
    	
    	System.out.println("Data Deleted Succesfully");
    	
    }
}
