package jdbcdemomaven;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class FetchDataDynamically {

	public static void main(String[] args) throws SQLException
	{
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/school","root","root");
		PreparedStatement ps=con.prepareStatement("select * from student where id=?");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter id to display details");
		int id=sc.nextInt();
		
		ps.setInt(1, id);
		ResultSet rs = ps.executeQuery();
		
		if(rs.next()) {
			System.out.println(rs.getInt(1));
			System.out.println(rs.getString(2));
			System.out.println(rs.getInt(3));
		}
		else {
			System.out.println("Student is not present");
		}
			

	}

}
