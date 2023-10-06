package jdbcdemomaven;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class BatchProcessingwithstatement {

	public static void main(String[] args) throws SQLException
	{
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/school","root","root");
		Statement st =con.createStatement();
		//st.addBatch("insert into student values(4,'Tina',25)");
		//st.addBatch("insert into student values(5,'Ranga',24)");
		//st.addBatch("insert into student values(6,'Manga',25)");
		//st.addBatch("hello everyone");
		//st.addBatch("insert into student values(7,'Sangmesh',26)");
		//st.addBatch("insert into student values(8,'rushikesh',27)");
		//st.addBatch("update student set name='prachi' where id=4");
		st.addBatch("delete from student where id=5");
		
		st.executeBatch();
		System.out.println("Batch executed Succesfully");
		

	}

}
